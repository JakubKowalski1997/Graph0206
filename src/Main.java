public class Main {
    public static void main(String args[])
    {
        HamiltonianCycle hamiltonian =
                new HamiltonianCycle();
//        /* Let us create the following graph
//           (0)--(1)--(2)
//            |   / \   |
//            |  /   \  |
//            | /     \ |
//           (3)-------(4)    */
//        int graph1[][] = {{0, 1, 0, 1, 0},
//                {1, 0, 1, 1, 1},
//                {0, 1, 0, 0, 1},
//                {1, 1, 0, 0, 1},
//                {0, 1, 1, 1, 0},
//        };
//
//        // Print the solution
//        hamiltonian.hamCycle(graph1);
//
//        /* Let us create the following graph
//           (0)--(1)--(2)
//            |   / \   |
//            |  /   \  |
//            | /     \ |
//           (3)       (4)    */
//        int graph2[][] = {{0, 1, 0, 1, 0},
//                {1, 0, 1, 1, 1},
//                {0, 1, 0, 0, 1},
//                {1, 1, 0, 0, 0},
//                {0, 1, 1, 0, 0},
//        };
//
//
//        // Print the solution
//        hamiltonian.hamCycle(graph2);

        System.out.println();
        int graph3[][] = {
                {0,1,1,1,1,0},
                {1,0,0,1,0,1},
                {1,0,0,1,1,0},
                {1,1,1,0,0,0},
                {1,0,1,0,0,1},
                {0,1,0,0,1,0},
        };
        hamiltonian.hamCycle(graph3);
    }
}
