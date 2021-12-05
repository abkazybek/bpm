package com.company.bpm.core;

import java.io.*;
import java.util.Properties;
import java.util.TreeMap;

public class Message {
    public static void main(String[] args) throws FileNotFoundException {
        File dir = new File("C:\\Users\\Admin\\IdeaProjects\\CubaProjects\\bpm");
        File[] files = dir.listFiles();
                for(int i=0; i<files.length; i++)
                {
                    if(files[i].getName().startsWith("messages.properties"))
                    {
                        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("messages.txt")));

                    }
                }
        Properties property = new Properties();
        property.load(files);
        TreeMap<String, String> messages = new TreeMap<String, String>();
        messages.get(files);
        TreeMap<Properties, TreeMap<String, String>> registry = new TreeMap<Properties, TreeMap<String, String>>();
        registry.put(files, messages);

    }

    }
