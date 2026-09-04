package implemntation.hashmap;


public class MyHashMap<K,V> {

    private static final int INITIAL_SIZE = 1<<4;

    private static final int MAXIMIM_CAPACITY = 1<<30;

public Entry[] hashTable;

public  MyHashMap(){
    hashTable = new Entry[INITIAL_SIZE];
}
    class  Entry<K , V>{
        public K key;
        public V value;
        public Entry next;


        Entry(K k, V v){
            key=k;
            value=v;
        }
    }




    public void put(K key,V value){
        int hashcode = key.hashCode() % hashTable.length;
        Entry  node = hashTable[hashcode];


        if(node==null){
            Entry newNode = new Entry(key,value);
            hashTable[hashcode]= newNode;

        }else {
            Entry pre = node;
            while(node !=null){
                if(node.key== key){
                    node.value=value;
                    return;
                }

                pre =node;
                node=node.next;
            }
            Entry newnnode= new Entry(key,value);
            pre.next=newnnode;
        }


    }



    public  V get(K key){
        int hascode = key.hashCode() % hashTable.length;
        Entry node = hashTable[hascode];
        while (node!=null){
            if (node.key.equals(key)){
                return (V) node.value;
            }
            node = node.next;
        }
        return null;
    }


}