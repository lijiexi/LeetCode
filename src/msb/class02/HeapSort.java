package msb.class02;

/**
 * Created by lijiexi on 2021/10/10.
 * 大根堆--任意父节点是以该节点为树的最大值
 * 任意值替换节点，大则heapinsert，小则heapify
 * 复杂度nlog,额外空间O(1)
 */
public class HeapSort {
    public static void main(String[] args){
        int test[] = {5,2,4,7,21,76,4};
        HeapSort(test);
        for(int i =0;i<test.length;i++){
            System.out.print(test[i]+" ");
        }
    }

    //将数组放入大根堆，再通过heapify排序
    public static void HeapSort(int[] arr){
        if(arr.length<2||arr == null){
            return;
        }
        //放入大根堆
        for(int i = 0;i<arr.length;i++){
            heapInsert(arr,i);
        }
        //挨个取出最大值
        int heapSize = arr.length;
        swap(arr,0,--heapSize);
        //将0处位置排序，重新变成大根树
        while(heapSize>0){
            heapify(arr,0,heapSize);
            swap(arr,0,--heapSize);
        }
    }

    //某个数出现在index位置，向上移动
    public  static void heapInsert(int[] arr,int index){
        //判断是否大于父节点
        while(arr[index]>arr[(index-1)/2]){
            //index和父节点交换
            swap(arr,index,(index-1)/2);
            index = (index-1)/2;
        }
    }

    //某个数在index位置，判断是否往下移动
    public static void heapify(int[] arr,int index,int heapSize){
        //左孩子下标
        int left = index*2+1;
        //下方还有孩子
        while(left<heapSize){
            //把largest给值最大的孩子
            int largest = left+1<heapSize&&arr[left+1]>arr[left]?left+1:left;
            //largest给父子节点中值大的
            largest = arr[index]>arr[largest]?index:largest;
            //判断大的是否为父节点
            if(largest == index){
                break;
            }
            swap(arr,index,largest);
            //继续向下移动
            index = largest;
            left = index*2+1;

        }
    }

    public static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
