
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class _01_Adjacency_List {
   static class Edge{
    int src;
    int dest;
    int wt;
    public Edge(int src, int dest, int wt) {
      this.src = src;
      this.dest = dest;
      this.wt = wt;
      }
   }
          public static void bfs(ArrayList<Edge> [] graph){
            Queue<Integer> q=new LinkedList<>();
             boolean vis[]=new boolean[graph.length];
             q.add(0); //source =0
 

          
          
          }
  public static void main(String[] args) {
     // array of arraylist <Edge> 
     //Edge ke pass src , dest, weight
     
      int V=5;
      
      ArrayList<Edge>[] graph = new ArrayList[V]; //null-->empty arraylist 
      for(int i=0;i<V;i++) {
        graph[i]=new ArrayList<>();
        }
        //0 --> vertex
       graph[0].add(new Edge(0, 1,5));

      // 1 --> vertex
      graph[1].add(new Edge(1, 0,5));
      graph[1].add(new Edge(1, 2,1));
      graph[1].add(new Edge(1, 3, 3));

      // 2 vertex
      graph[2].add(new Edge(2, 1, 1));
      graph[2].add(new Edge(2, 3, 1));
      graph[2].add(new Edge(2, 4, 4));

      // 3 vertex
      graph[3].add(new Edge(3,1, 3));
      graph[3].add(new Edge(3, 2, 1));

      // 4 vertex
      graph[4].add(new Edge(2, 1, 1));

    // 2's neighbours
    for(int i=0; i<graph[2].size(); i++) {
      Edge e = graph[2].get(i);
      System.out.println(e.dest);
    }

      
  }  
}


// Adjacency matrix
// 0 0 0 0 0
// 0 0 0 0 0
// 0 0 0 0 0
// 0 0 0 0 0
// 0 0 0 0 0
// i, j -> weight of edge between i and j
// if no edge -> 0
// if edge -> weight



































// import java.util.ArrayList;

// public class _01_Adjacency_List{
//   static class Edge{
//     int src;
//     int dest;
//     int wt;

//         public Edge() {
//         }
//     public Edge(int src, int dest, int wt) {
//    this.src=src;
//    this.dest=dest;
//    this.wt=wt;
//     }   
//   }


  
//   public static void main(String args[]){
//         int V=5;
//        ArrayList<Edge>[] graph=new ArrayList[V];   
//         for(int i=0; i<graph.length;i++){
//           graph[i]=new ArrayList<>();
//         }

        
//   }
// }