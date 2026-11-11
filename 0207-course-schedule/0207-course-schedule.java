class Solution {
    public boolean canFinish(int n, int[][] edge) {
        // building Graph
        ArrayList<ArrayList<Integer>> graph=new ArrayList<>();

        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }

        int inDegree[]=new int[n];

        for(int[] e : edge){
            int u=e[0];
            int v=e[1];
            graph.get(v).add(u);
            inDegree[u]++;
        }

        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(inDegree[i]==0){
                q.add(i);
            }
        }

        int completed=0;
        while(!q.isEmpty()){
            int curr= q.poll();
            completed++;
            for(int neighbour : graph.get(curr)){
                inDegree[neighbour]--;
                if(inDegree[neighbour] == 0){
                    q.add(neighbour);
                }
            }
        }
        return completed==n;
        
    }
}