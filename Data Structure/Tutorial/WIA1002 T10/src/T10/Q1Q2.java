/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package T10;

/**
 *
 * @author HP
 */
public class Q1Q2 {
    /* Q1
     * The base case of f(n) is n == 1, in which the method stops the recursion.
     * When evaluate f(n = 0), every subsequent recursive call will decrement the n by 1.
     * Since n is always lower than 1, the method will not reach the base case and will not terminate.
     * (StackOverflowError will be thrown first before n is overflowed back to 0.)
     */
    
    /* Q2
     * The base case of f(n) is n == 0, in which the method stops the recursion.
     * When evaluate f(n > 0), every subsequent recursive call will increment the n by 1.
     * Since n is always larger than 0, the method will not reach the base case and will not terminate.
     * (StackOverflowError will be thrown first before n is overflowed back to 0.)
     */
}
