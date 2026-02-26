//  max distance from the gas station Brute force
// public class BS21 {
//     public double minMaxDist(int[] stations, int K) {
//         // code here
//         int n = stations.length;
//         int[] howMany = new int[n - 1];
//        for(int gasStation = 1; gasStation <= K; gasStation++){
//            double maxSection = -1;
//            int maxIndex = -1;
           
//            for(int i=0 ; i<n-1 ;i++){
//                double diff = stations[i+1] - stations[i];
//                double SectionLength = diff / (double) (howMany[i] + 1);
               
//                if(SectionLength > maxSection){
//                    maxSection = SectionLength;
//                    maxIndex = i;
//                }
//            }
//            howMany[maxIndex]++;
//        }
       
//         double maxAns =-1;
//        for(int i=0;i< n-1;i++){
//            double diff = stations[i+1] - stations[i];
//            double SectionLength = diff /(double)(howMany[i]+1);
//            maxAns = Math.max(maxAns, SectionLength);
//        }
//        return maxAns;
//     }
// }


//  