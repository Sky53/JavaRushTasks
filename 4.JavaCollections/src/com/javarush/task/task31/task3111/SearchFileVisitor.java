package com.javarush.task.task31.task3111;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class SearchFileVisitor extends SimpleFileVisitor<Path> {
    private String partOfName;
    private String partOfContent;
    private int minSize = -1;
    private int maxSize = -1;
    private List<Path> foundFiles = new ArrayList<>();

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        if ((minSize == -1|| Files.size(file) > minSize) && (maxSize == -1 || Files.size(file) < maxSize)) {
            if (partOfName == null || file.getFileName().toString().contains(partOfName)) {
                if (partOfContent == null) {
                    foundFiles.add(file);
                } else {
                    String string = new String(Files.readAllBytes(file));
                    if (string.contains(partOfContent)) {
                        foundFiles.add(file);
                    }
                }
            }
        }
        return FileVisitResult.CONTINUE;
    }

    public void setPartOfName(String amigo) {
        this.partOfName = amigo;
    }

    public void setPartOfContent(String programmer) {
        this.partOfContent = programmer;
    }

    public void setMinSize(int i) {
        this.minSize = i;
    }

    public void setMaxSize(int i) {
        this.maxSize = i;
    }

    public String getPartOfName() {
        return partOfName;
    }

    public String getPartOfContent() {
        return partOfContent;
    }

    public int getMinSize() {
        return minSize;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setFoundFiles(List<Path> foundFiles) {
        this.foundFiles = foundFiles;
    }

    public List<Path> getFoundFiles() {
        return foundFiles;
    }
}
