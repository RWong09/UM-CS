/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T9;
import java.util.Arrays;
/**
 *
 * @author HP
 */
public class Q2 {
    public static void main(String[] args) {
        int[][] adjacencyMatrix = {
                {0,0,1,1,0,0,0,0,0},
                {0,0,0,1,0,0,0,0,0},
                {0,0,0,0,1,1,0,0,0},
                {0,0,0,0,1,0,0,0,0},
                {0,0,0,0,0,0,1,0,0},
                {0,0,0,0,0,0,0,1,0},
                {0,0,0,0,0,0,0,1,0},
                {0,0,0,0,0,0,0,0,1},
                {0,0,0,0,0,0,0,0,0}
        };
        System.out.println(Arrays.deepToString(adjacencyMatrix));
        // Adjacency matrix is used.
    }
}
