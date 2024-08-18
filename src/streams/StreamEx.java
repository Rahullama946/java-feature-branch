package streams;

public class StreamEx {
    public static void main(String[] args) {

//In list find strings whose length is >=8 and store it in another list.
//        ArrayList<String> list = new ArrayList<>();
//        list.add("Rohit");
//        list.add("Bhavna");
//        list.add("Shivani");
//        list.add("Javamultiplex");
//        list.add("Rudrapur");
//       List<String> finalList= list.stream().filter(a->a.length()>=8).toList();
        //to uppercase
//        List<String> finalList =list.stream().map(a->a.toUpperCase()).toList();
//In list count number of strings whose length is >=8.
//        Integer finalList=(int) list.stream().filter(a->a.length()>=8).count();
//        System.out.println("count value "+finalList);

    //        ArrayList<Integer> list = new ArrayList<>();
    //        list.add(0);
    //        list.add(10);
    //        list.add(20);
    //        list.add(5);
    //        list.add(15);
    //        list.add(25);
    //        //Convert list to array.
    //       Integer[] arr1= list.toArray(Integer[]::new);
    //        System.out.println(" original type "+list);
    //        for(Integer val:arr1){
    //            System.out.println(" value is "+val);
    //        }


        //Find minimum and maximum in given list.
//        Integer min=list.stream().min(Integer::compareTo).get();
//        Integer max=list.stream().max(Integer::compareTo).get();
//        System.out.println("min  "+min +"  max "+max);


        //Sort list elements in natural and customized order.
//        List<Integer> finalList=list.stream().sorted().toList();
//        List<Integer> descList= list.stream().sorted((a,b)->-a.compareTo(b)).toList();
//        System.out.println("final list "+finalList);
//        System.out.println("final desc list "+descList);


        //even list
//       List<Integer> list= list.stream().filter(a->a%2==0).toList();
        //double the value of the list
//        List<Integer> finalList= list.stream().map(a->a*2).toList();

//        finalList.forEach(System.out::println);



//        Stream<Integer> streamList= Stream.of(99,123,14);
//        streamList.forEach(a-> System.out.println("type of "+a+" is "+a.getClass()));
//        Double[] doub={10.0,2.0,123.0};
//        Stream<Double> streDoub=Stream.of(doub);
//        streDoub.forEach(System.out::println);


    }
}
