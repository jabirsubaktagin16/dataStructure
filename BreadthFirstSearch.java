import java.awt.Color;
import java.util.*;
import java.io.*;
import java.util.Queue;
import java.util.logging.Level;
import java.util.logging.Logger;
public class BreadthFirstSearch {
    public static PriorityQueue<Integer>q=new PriorityQueue<Integer>() ;
    public static Color myWhite = new Color(255, 255, 255);
    public static Color myGray = new Color(160, 160, 160);
    public static Color myBlack = new Color(0, 0, 0);
    public static int white=myWhite.getRGB();
    public static int gray=myGray.getRGB();
    public static int black = myBlack.getRGB();

    public static int[][] adj=new int [100][100];
    public static int[] color=new int[100];
    public static int[] parent=new int[100];
    public static int[] dis=new int[100];
    public static int node,edge;
    public static Scanner sc=new Scanner(System.in);

    public static void bfs(int startingNode)
    {
        for(int i=0;i<node;i++)
        {
            color[i] = white;
            parent[i] = -1;
            dis[i] = Integer.MIN_VALUE;
        }
        dis[startingNode] = 0;
        parent[startingNode] = -1;
        q.offer(startingNode);
        while(!q.isEmpty())
        {
            int x = q.peek();
            q.poll();
            color[x] = gray;
            System.out.println(x);
            for(int i=0;i<node;i++)
            {
                if(adj[x][i]==1)
                {
                    if(color[i]==white)
                    {
                        parent[i] = x;
                        dis[i] = dis[x] + 1;
                        q.offer(i);
                    }
                }
            }
            color[x] = black;
        }
    }
    public static void main(String[]args) throws FileNotFoundException
    {
        int n1,n2;
        try{
        FileReader fr=new FileReader("F:\\Study\\2.1\\CSE 2104- Data Structures Lab\\Assignment 8\\BFS\\bfs.txt");
        BufferedReader br=new BufferedReader(fr);
        
        node=sc.nextInt();
        edge=sc.nextInt();
        for(int i=0;i<edge;i++)
        {
            n1=br.read();
            n2=br.read();
            adj[n1][n2] = 1;
            adj[n2][n1] = 1;
        }
        for(int i=0;i<node;i++)
        {
            for(int j=0;j<node;j++)
            {
                System.out.print("\t"+adj[i][j]);
            }
            System.out.println();
        }
        bfs(0);
        br.close();
        }
        catch(IOException ex){
            Logger.getLogger(BreadthFirstSearch.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
