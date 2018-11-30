import java.util.Arrays;

public class Runner
{
    public static void main(String[] args)
    {
        int[] arr= new int[10000];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=(int)(Math.random()*10000)+0;
        }
        System.out.print("Unsorted Array: ");
       // for(int i=0;i<arr.length;i++) { System.out.print(arr[i]+" "); }

        Team0SortCompetition a1 = new Team0SortCompetition();

        long time = System.nanoTime();

        a1.challengeOne(arr);

        System.out.println("\n"+"Time: "+(double)(System.nanoTime() - time)/(100000000)+" secs");
        
        System.out.print("Sorted Array: ");
        // for(int i=0;i<arr.length;i++) { System.out.print(arr[i]+" "); }
        System.out.println("\n"+"Median: "+a1.challengeOne(arr));

        System.out.println();

        String[] arr2 = new String[10000];
        int a; String h; String c="";
        String alpha="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for(int i=0;i<arr2.length;i++)
        {
            c="";
            for(int k=0;k<5;k++)
            {
                a= (int)(Math.random()*25)+0;
                h=alpha.substring(a,a+1);
                c=c+h;
            }
            arr2[i]=c;
        }
        System.out.print("Unsorted Array: ");
        //for(int i=0;i<arr.length;i++) { System.out.print(arr2[i]+" ");}
        Team0SortCompetition a2 = new Team0SortCompetition();

        long time2 = System.nanoTime();

        a2.challengeTwo(arr2,"AAOBX");

        System.out.println("\n"+"Time: "+(double)(System.nanoTime() - time2)/(100000000)+" secs");

        System.out.print("Sorted Array: ");
        //for(int i=0;i<arr2.length;i++) { System.out.print(arr2[i]+" "); }
        System.out.println("\n"+"Median: "+a2.challengeTwo(arr2,"AAOBX"));


        System.out.println();


        int[] arr3= new int[100000];
        for(int i=0;i<arr3.length;i++)
        {
            arr3[i]=(int)(Math.random()*10000)+0;
        }
        Arrays.sort(arr3);
        for(int i=0;i<200;i++)
        {
            arr3[i]=(int)(Math.random()*10000)+0;
        }
        System.out.print("Unsorted Array: ");
        //for(int i=0;i<arr2.length;i++) { System.out.print(arr2[i]+" "); }

        Team0SortCompetition a3 = new Team0SortCompetition();

        long time3 = System.nanoTime();

        a3.challengeThree(arr3);

        System.out.println("\n"+"Time: "+(double)(System.nanoTime() - time3)/(100000000)+" secs");

        System.out.print("Sorted Array: ");
        //for(int i=0;i<arr3.length;i++) { System.out.print(arr3[i]+" "); }
        System.out.println("\n"+"Median: "+a3.challengeThree(arr3));

        System.out.println();

        int[][] arr4= new int[1000][1000];
        for(int i=0;i<1000;i++)
        {
            for(int k=0;k<1000;k++) {
                arr4[i][k] = (int) (Math.random() * 10000) + 0;
            }
        }
        Team0SortCompetition a4 = new Team0SortCompetition();
        System.out.print("Unsorted Array: ");
        //for(int i=0;i<arr4.length;i++){for(int k=0;k<arr4[i].length;k++) {System.out.println(arr4[i][k] + " ");}}
        long time4 = System.nanoTime();

        a4.challengeFour(arr4);

        System.out.println("\n"+"Time: "+(double)(System.nanoTime() - time4)/(100000000)+" secs");

        System.out.print("Sorted Array: ");
        //for(int i=0;i<arr4.length;i++){for(int k=0;k<arr4[i].length;k++) {System.out.println(arr4[i][k] + " ");}}
        System.out.println("\n"+"Median: "+a4.challengeFour(arr4));
    }
}
