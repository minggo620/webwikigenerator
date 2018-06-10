package com.minggo.test;

import org.junit.Test;

import com.sun.javadoc.ClassDoc;
import com.sun.javadoc.MethodDoc;
import com.sun.javadoc.RootDoc;

public class TestDescare{
	
	@Test
	public void testGetParam(){
		 
	}
	public static boolean start(RootDoc root) {
        ClassDoc[] classes = root.classes();
        
        for (int i = 0; i < classes.length; ++i) {
            System.out.println(classes[i]);
            
            System.out.println(classes[i]);
            System.out.println(classes[i].commentText());
            for(MethodDoc method:classes[i].methods()){
                System.out.printf("\t%s\n", method.commentText());
            }
        }
        return true;
    }
}
