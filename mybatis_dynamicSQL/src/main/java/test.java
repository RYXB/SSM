public class test {
    public static void main(String[] args) {
        int n[] = {6,5,2,7,3,9,8,4,10,1};
        quickSort(n);
        System.out.println("快排结果：");
        for (int i : n) {
            System.out.print(i+" ");
        }
    }

    public static void quickSort(int n[]){
        Sort(n,0,n.length-1);
    }

    public static void Sort(int n[],int l,int r){
        if(l<r){
            int index = partition(n,l,r);
            Sort(n,l,index-1);
            Sort(n,index+1,r);
        }
    }

    public static int partition(int n[],int l, int r){
        int p = n[l];
        int i = l;
        int j = r;
        while (i<j){
            while (n[j]>=p && i<j){
                j--;
            }
            while (n[i]<=p&&i<j){
                i++;
            }
            swap(n,i,j);
        }
        swap(n,l,i);
        return i;
    }

    public static void swap(int n[],int i,int j){
        int temp = n[i];
        n[i] = n[j];
        n[j] = temp;
    }
}
