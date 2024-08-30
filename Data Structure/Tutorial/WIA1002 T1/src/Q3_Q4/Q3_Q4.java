/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q3_Q4;

/**
 *
 * @author HP
 */
public class Q3_Q4 {
    /**
     * Q3:What is a raw type?
     * A raw type is a generic class or interface used without a type parameter.
     * 
     * Why is a raw type unsafe?
     * It bypasses generic type checks during compilation and leads to runtime exceptions.
     * 
     * Why is the raw type allowed in Java?
     * To allow backward compatibilities for legacy code since generics are introduced only in JDK 5.
     * 
     * Q4:What is erasure?
     * An implementation of generics where the compiler erases the generic type information after using it to compile the code.
     * 
     * Why are Java generics implements using erasure?
     * To allow backward compatibility for legacy code that uses raw types.
     */
}
