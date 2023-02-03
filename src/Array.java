class Array{
    public static void  main(String[] args){
        int array[] = new int[20];
        for (int count = 0;count < 20;count++){
            array[count] = count+1;
        }

        for (int count = 0;count < 20;count++){
            System.out.println("array["+count+"] = "+array[count]);
        }
        System.out.println("Length of the array : "+array.length);
    }
}