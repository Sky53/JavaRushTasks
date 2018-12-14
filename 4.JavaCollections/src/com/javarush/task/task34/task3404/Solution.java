package com.javarush.task.task34.task3404;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

/*
Рекурсия для мат. выражения
*/
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.recursion("sin(2*(-5+1.5*4)+28)", 0); //expected output 0.5 6
        solution.recursion("tan(2025 ^ 0.5)", 0); //expected output 1 2
    }

    public void recursion(final String expression, int countOperation) {
        //implement
        //convert degreese to radians x=gr*pi/180
        int numberOfOperations=0;
        String operationString=expression.replace(" ","");
        for (int i=0; i<operationString.length()-1; i++)
        {
            if(expression.substring(i,i+1).matches("\\+")
                    ||operationString.substring(i,i+1).matches("\\-")
                    ||operationString.substring(i,i+1).matches("\\*")
                    ||operationString.substring(i,i+1).matches("/")
                    ||operationString.substring(i,i+1).matches("\\^")
                    ||operationString.substring(i,i+1).matches("i")
                    ||operationString.substring(i,i+1).matches("a")
                    ||operationString.substring(i,i+1).matches("o"))
            {
                numberOfOperations++;
            }
        }
        String result;
        int count=0;
        if (operationString.substring(0,1).equals("("))
        {
            int start=1;
            int end=0;
            count=1;
            while (count<operationString.length() && start!=end)
            {
                String temp=operationString.substring(count,count+1);
                if (temp.equals("("))
                {
                    start++;
                }
                if (temp.equals(")"))
                {
                    end++;
                }
                count++;
            }
        }
        if (count!=operationString.length() && !operationString.substring(0,1).equals("("))
        {
            //разбиваем выражения на подвыражения
            List<String> symbols=new ArrayList<>();
            for (int i=0; i<operationString.length()-1;)
            {
                String temp=operationString.substring(i,i+1);
                if ("+-*/^".contains(temp))
                {
                    symbols.add(temp);
                    i++;
                }
                if(temp.equals("s") || temp.equals("t") || temp.equals("c"))
                {
                    symbols.add(operationString.substring(i,i+3));
                    i=i+3;
                }
                if (temp.matches("\\d"))
                {
                    int k=i+1;
                    StringBuilder sb=new StringBuilder(temp);
                    while (k<operationString.length()&&(operationString.substring(k,k+1).matches("\\d")||operationString.substring(k,k+1).matches("\\.")))
                    {
                        sb.append(operationString.substring(k,k+1));
                        k++;
                    }
                    i=k;
                    symbols.add(new String(sb));
                }
                if (temp.equals("("))
                {
                    int start=1;
                    int end=0;
                    int k=i+1;
                    while(k<operationString.length() && start!=end)
                    {
                        if (operationString.substring(k,k+1).equals("("))
                        {
                            start++;
                        }
                        if(operationString.substring(k,k+1).equals(")"))
                        {
                            end++;
                        }
                        k++;
                    }
                    PrintStream oldOut=System.out;
                    String recTemp;
                    ByteArrayOutputStream baos=new ByteArrayOutputStream();
                    PrintStream ps=new PrintStream(baos);
                    System.setOut(ps);
                    recursion(operationString.substring(i,k),++countOperation);
                    recTemp=baos.toString();
                    System.setOut(oldOut);
                    symbols.add(recTemp);
                    i=k;
                }
            }

            for (int i=0; i<symbols.size(); i++)
            {
                if (symbols.get(i).startsWith("s"))
                {
                    symbols.set(i,""+Math.sin(Double.parseDouble(symbols.remove(i+1))*Math.PI/180));
                }
                if (symbols.get(i).startsWith("t"))
                {
                    symbols.set(i,""+Math.tan(Double.parseDouble(symbols.remove(i+1))*Math.PI/180));
                }
                if (symbols.get(i).startsWith("c"))
                {
                    symbols.set(i,""+Math.cos(Double.parseDouble(symbols.remove(i+1))*Math.PI/180));
                }
            }
            for (int i=0; i<symbols.size();)
            {
                if (symbols.get(i).equals("^"))
                {
                    symbols.set(i-1, Math.pow(Double.parseDouble(symbols.get(i - 1)), Double.parseDouble(symbols.get(i + 1))) + "");
                    symbols.remove(i);
                    symbols.remove(i);
                    i--;
                }
                i++;
            }
            for (int i=0; i<symbols.size();)
            {
                if (symbols.get(i).equals("/"))
                {
                    symbols.set(i-1, Double.parseDouble(symbols.get(i - 1))/Double.parseDouble(symbols.get(i + 1)) + "");
                    symbols.remove(i);
                    symbols.remove(i);
                    i--;
                }
                if (symbols.get(i).equals("*"))
                {
                    symbols.set(i-1, Double.parseDouble(symbols.get(i - 1))*Double.parseDouble(symbols.get(i + 1)) + "");
                    symbols.remove(i);
                    symbols.remove(i);
                    i--;
                }
                i++;
            }
            for (int i=0; i<symbols.size(); i++)
            {
                if (symbols.get(i).equals("-"))
                {
                    symbols.set(i,"-"+symbols.remove(i+1));
                }
                if (symbols.get(i).equals("+"))
                {
                    symbols.remove(i);
                    i--;
                }
            }
            double answer=0;
            for (String s:symbols)
            {
                answer=answer+Double.parseDouble(s);
            }
            result=answer+"";
            countOperation--;
        }
        else
        {
            //отбрасываем начальные и конечные скобки
            operationString=operationString.substring(1,operationString.length()-1);
            PrintStream oldOut=System.out;
            ByteArrayOutputStream baos=new ByteArrayOutputStream();
            PrintStream ps=new PrintStream(baos);
            System.setOut(ps);
            recursion(operationString,++countOperation);
            result=baos.toString();
            System.setOut(oldOut);
        }
        if (countOperation==0)
        {
            System.out.println(result+" "+numberOfOperations);
        }
        else
        {
            System.out.println(result);
        }
    }
    public Solution() {
        //don't delete
    }
}