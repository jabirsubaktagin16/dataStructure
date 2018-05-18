
import java.awt.Color;
import java.util.*;
import java.io.*;
import java.util.Queue;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DepthFirstSearch {

    public static PriorityQueue<Integer> q = new PriorityQueue();
    public static Color myWhite = new Color(255, 255, 255);
    public static Color myGray = new Color(160, 160, 160);
    public static Color myBlack = new Color(0, 0, 0);
    public static int white = myWhite.getRGB();
    public static int gray = myGray.getRGB();
    public static int black = myBlack.getRGB();

    public static int[][] adj = new int[100][100];
    public static int[] color = new int[100];
    public static int node, edge;
    public static Scanner sc = new Scanner(System.in);

    public static void DFSVisit(int x) {
        color[x] = gray;

        for (int i = 0; i < node; i++) {
            if (adj[x][i] == 1) {
                if (color[i] == white) {
                    DFSVisit(i);
                }
            }
        }

        color[x] = black;
    }

    public static void DFS() {
        for (int i = 0; i < node; i++) {
            color[i] = white;

        }
        for (int i = 0; i < node; i++) {
            if (color[i] == white) {
                DFSVisit(i);
            }
        }

    }

    public static void main(String[] args) throws FileNotFoundException {
        int n1, n2;

        try {
            FileReader fr = new FileReader("F:\\Study\\2.1\\CSE 2104- Data Structures Lab\\Assignment 8\\DFS\\dfs.txt");
            BufferedReader br = new BufferedReader(fr);
            String msg = "", line = br.readLine();
            while (line != null) {
                msg += line + "\n";
                line = br.readLine();
            }
            for (int i = 0; i < edge; i++) {
                n1 = br.read();
                n2 = br.read();
                adj[n1][n2] = 1;
                adj[n2][n1] = 1;
            }
            br.close();
            System.out.println(msg);
        } catch (IOException ex) {
            Logger.getLogger(DepthFirstSearch.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
