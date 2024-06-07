package JAVA;

import java.util.*;

public class assign1
{
public static void main(String[] args)
{
String s="my my you you is das";
String[] str=s.split(" ");
HashMap<String,Integer>map= new HashMap<String,Integer>();

for(int i=0;i<str.length;i++)
{
if(map.containsKey(str[i]))
{
   map.put(str[i],map.get(str[i])+1);
}

else
{
map.put(str[i],1);
}

}

System.out.println(map);
}

}