class BinaryHeap{

    /**
     * Here the nodes are numbered as 1(root),2,3,4,5,6.... instead of 0(root),1,2,3,4,5......
     * */
    static class MinHeap{
        final public int[] array;
        int size;
        final int maxSize;
        
        public MinHeap(int maxSize){
            this.size = 0;
            this.array = new int[maxSize+1];
            this.maxSize = maxSize;
        }
        
        public int parent(int pos){
            return pos/2;
        }
        
        public int leftChild(int pos){
            return 2*pos;
        }
        
        public int rightChild(int pos){
            return 2*pos + 1;
        }
        
        public int swap(int pos1, int pos2){
            int temp = pos1;
            array[pos1] = array[pos2];
            array[pos2] = temp;
        }
        
        public boolean isLeaf(int pos){
            return (leftChild(pos) > size);
        }
        
        public void heapifyDown(int pos){
            if(!isLeaf(pos)){
                int l = leftChild(pos);
                int r = rightChild(pos);
                if(array[l] > array[pos] && ((r < size && array[l] >= array[r]) || r > size)){
                    swap(l,pos);
                    heapifyDown(l);
                }
                else if(array[r] > array[pos] && array[r] >= array[l] && r < size){
                    swap(r,pos);
                    heapifyDown(r);
                }
            }
        }
        
        public void insert(int element){
            array[++size] = element;
            int current = size;
            while(array[current] < array[parent(pos)]){
                swap(pos, parent(pos));
                current = parent(pos);
            }
        }
        
        public int extract(){
            int response = array[0];
            int data = array[size];
            array[0] = data;
            size--;
            heapifyDown(0);
            return response;
        }
        
    }
    
    

}
