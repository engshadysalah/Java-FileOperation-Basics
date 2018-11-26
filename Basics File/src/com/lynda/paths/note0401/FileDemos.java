/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lynda.paths.note0401;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author root
 */
public class FileDemos {

    public static void main(String[] args) {

        try {

            // create a directory
            // Files.createDirectory(Paths.get("data"));
            // create a directory with intermediate directories
            // Files.createDirectory(Paths.get("sub1", "sub2", "sub3"));
            // create file in this directory
            // Files.createFile(Paths.get("sub1", "sub2", "sub3", "newFile.txt"));
            /// Delet all of them
            boolean deleted = Files.deleteIfExists(Paths.get("sub1", "sub2", "sub3", "newFile.txt"));

            deleted = Files.deleteIfExists(Paths.get("data"));

            deleted = Files.deleteIfExists(Paths.get("sub1", "sub2", "sub3"));

            deleted = Files.deleteIfExists(Paths.get("sub1", "sub2"));

            deleted = Files.deleteIfExists(Paths.get("sub1"));

            System.out.println("============== access file & read them ==============");

            Path targetDirectory = Paths.get(File.separator, "home", "shady", "Desktop", "TestPaths");
            Path dataFile = targetDirectory.resolve("file1");
            System.out.println(Files.lines(dataFile).collect(Collectors.toList()));

//            for (String data : Files.lines(dataFile).collect(Collectors.toList())) {
//
//                System.out.println(data);
//            }

            System.out.println("============== copy file to new locatio ==============");

            Path destion = targetDirectory.resolve("file1_copy");
            // Files.copy(dataFile, destion);

            System.out.println("============== Move file to new locatio ==============");

            Path other = targetDirectory.resolve("file1_moved");
            // Files.move(destion, other);

            System.out.println("============== delet file if exists ==============");

            Files.deleteIfExists(other);

            System.out.println("============== visit all files in same dir==============");

            Path directory = Paths.get(File.separator, "home", "shady", "Desktop", "TestPaths");
            try (Stream<Path> enteries = Files.walk(directory)) {

//                enteries.forEach(System.out::println);

                //enteries.map(String::trim);
//                
//                Stream<Path> enteries2 = Files.walk(directory);
//
//                // All files in Array
//                Object[] files = enteries2.toArray();
//                for (int i = 0; i < files.length; i++) {
//                    Object object = files[i];
//                    System.out.println(object.toString());
//                }
//
//                // All files in ArrayLisr
//                List<Object> asList = Arrays.asList(files);
//                for (Object object : asList) {
//                    System.out.println(object);
//                }
// to get fulename using split path  by   / 
                getFiles("/home/shady/Desktop");

            }

        } catch (IOException ex) {
            Logger.getLogger(FileDemos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // get all files in directory and subDirectory
    public static List getFiles(String directoryPath) {

        ArrayList<File> files = new ArrayList<>();

        File directory = new File(directoryPath);

        // get all the files from a directory
        File[] fList = directory.listFiles();

        for (File file : fList) {
            if (file.isFile()) {

                files.add(file);

            } else if (file.isDirectory()) {

                getFiles(file.getAbsolutePath());
            }
        }
        return files;
    }
}
