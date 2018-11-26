/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lynda.paths.note0401;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author root
 */
public class PathDemos {

    public static void main(String[] args) {

        System.out.println("========================== (1) : create Path===================================");

        // using Paths.get : to create path
        ///home/shady/Desktop/
        Path dictionary = Paths.get(File.separator, "home", "shady", "Desktop", "TestPaths");
        System.out.println(dictionary);

        /////////////////////////////////////////////////
        System.out.println("========================== (2) : get Path===================================");

        Path targetDirectory = Paths.get("/home/shady/Desktop/TestPaths");
        System.out.println(targetDirectory);

        System.out.println("========================== (3) : resolve to find nested pathes ===================================");

        //using resolve to find nested pathes
        Path docs = targetDirectory.resolve("file1");
        System.out.println(docs);

        System.out.println("========================== (4) : resolveSibling to  to find nested pathes in ... ===================================");

        //using resolveSibling  as well
        Path downloads = targetDirectory.resolveSibling("Linkis");
        System.out.println(downloads);

        System.out.println("========================== (5) :project directory  ===================================");

        // project directory
        Path project = Paths.get(".");
        System.out.println(project);
        System.out.println(project.toAbsolutePath());
        System.out.println("As a uri : " + project.toUri());

        System.out.println("get Perant :" + project.toAbsolutePath().getParent());
        System.out.println("get file name :" + project.toAbsolutePath().getFileName());
        System.out.println("get root :" + project.toAbsolutePath().getRoot());

        for (Path path : project.toAbsolutePath()) {
            System.out.println(path);
        }

        System.out.println("========================== (6) : Normalize Path  ===================================");

        /////////////////////////////////////////////////
        // Normalize Path
        Path p = Paths.get("/home/shady/./TestPaths/file1/..").normalize();
        System.out.println("normalize : " + p);

        System.out.println("========================== (7) : project directory ===================================");

        File localDir = new File("..");
        System.out.println(localDir);
        System.out.println(localDir.toPath().toAbsolutePath());
        System.out.println(localDir.toPath().toAbsolutePath().normalize());
        
        try {
            Files.createDirectory(Paths.get("/home/shady/Desktop/data"));
        } catch (IOException ex) {
            Logger.getLogger(PathDemos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
