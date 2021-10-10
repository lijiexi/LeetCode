package msb.class02;

/**
 * Created by lijiexi on 2021/10/9.
 * 求每个数左边比他小的数之和
 * 转换成求每个数右边比它大的数的个数*该数
 * 使用merge边排序边计算小和
 */
public class SmallSum {

        public static void main(String[] args){
            int test[] = {1,3,4,2,5};
            int res = process(test,0,test.length-1);
            for(int i =0;i<test.length;i++){
                System.out.print(test[i]+" ");
            }
            System.out.println();
            System.out.print("small sum is: "+res);
        }
    public static int process(int[] arr,int L,int R){
        if(L == R){
            return 0;
        }
        int Mid = L + ((R-L)>>1);
        return process(arr,L,Mid)+process(arr,Mid+1,R)+merge(arr,L,Mid,R);

    }
    //merge
    public static int merge(int[] arr,int L,int M,int R){
        int res = 0;
        int i = 0;
        int help[] = new int[R-L+1];
        //左区～Mid
        int p1 = L;
        //Mid～最右边
        int p2 = M+1;
        //左右都没有越界
        while(p1<=M&&p2<=R){
            res += arr[p1]<arr[p2]?(R-p2+1)*arr[p1]:0;
            //开始merge排序
            help[i++] = arr[p1]<arr[p2]?arr[p1++]:arr[p2++];
        }
        while(p1<=M){
            help[i++] = arr[p1++];
        }
        while(p2<=R){
            help[i++] = arr[p2++];
        }
        for(i = 0;i<help.length;i++){
            arr[L+i] = help[i];
        }

        return res;
    }
}
