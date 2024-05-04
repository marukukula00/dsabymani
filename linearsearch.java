import java.util.ArrayList;

class linearsearch{
    public static void main(String [] args){
int[ ] arr={1,2,3,4,4,5,6};
       // System.out.println(searchindex(arr,5,0));
       System.out.println(findallindex(arr, 4, 0,new ArrayList<>()));
       System.out.println(findallindex2(arr, 4, 0));
    }
    //this to find whether the target elements exist or not
    public static boolean search(int[] arr,int target,int index){
        if(index==arr.length){
            return false;
        }
        return arr[index]==target|| search(arr,target,index+1);
    
        }
        // this function is to find the index of the target element
        public static int searchindex(int[] arr,int target,int index){
            if(index==arr.length){
                return -1;
            }
            if( arr[index]==target){
            return index;
            }
            return  searchindex(arr,target,index+1);
        
            }
             //  ArrayList<Integer> list=new ArrayList<>();
             static ArrayList<Integer> findallindex(int[] arr,int target,int index,ArrayList<Integer> list){
                if(index==arr.length){
                    return list ;

                }
                if(arr[index]==target){
                    list.add(index);
                }
                
                return findallindex(arr, target, index+1,list);
                

             }
             //arraylist(return list without passing the argument)
             static ArrayList<Integer> findallindex2(int[] arr,int target,int index){
               ArrayList<Integer> list=new ArrayList<>();
                if(index==arr.length){
                    return list ;

                }
                if(arr[index]==target){
                    list.add(index);
                }
                
                ArrayList<Integer> ans= findallindex2(arr, target, index+1);
                list.addAll(ans);
                return list;

             }

    }

