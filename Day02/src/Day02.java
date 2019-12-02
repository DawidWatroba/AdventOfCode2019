public class Day02 {
    private int counter(int[] table){
        for(int i = 0; i<=table.length; i++){
            if(table[i]==1){
                table[table[i+3]]=table[table[i+1]]+table[table[i+2]];
                i+=3;
            }else if(table[i]==2){
                table[table[i+3]]=table[table[i+1]]*table[table[i+2]];
                i+=3;
            }else if(table[i]==99){
                break;
            }else{
                System.err.println("ERROR");
            }
        }
        return table[0];
    }
    public static void main(String[] args) {
        int[] numbers = {
                1,12,2,3,
                1,1,2,3,
                1,3,4,3,
                1,5,0,3,
                2,13,1,19,
                1,19,6,23,
                1,23,6,27,
                1,13,27,31,
                2,13,31,35,
                1,5,35,39,
                2,39,13,43,
                1,10,43,47,
                2,13,47,51,
                1,6,51,55,
                2,55,13,59,
                1,59,10,63,
                1,63,10,67,
                2,10,67,71,
                1,6,71,75,
                1,10,75,79,
                1,79,9,83,
                2,83,6,87,
                2,87,9,91,
                1,5,91,95,
                1,6,95,99,
                1,99,9,103,
                2,10,103,107,
                1,107,6,111,
                2,9,111,115,
                1,5,115,119,
                1,10,119,123,
                1,2,123,127,
                1,127,6,0,
                99,2,14,0,0};
        Day02 day02 = new Day02();
        int [] temp = numbers.clone();
       System.out.println(day02.counter(temp));
        int verb=0 ,noun =0;
        try {
            temp = numbers.clone();
            for (int i = 20; i < 100; i++) {
                numbers[1] = i;
                try {
                    for (int j = 0; j < 100; j++) {
                        numbers[2] = j;
                        int result = day02.counter(temp);
                        try {
                            if (result == 19690720) {
                                noun = temp[1];
                                verb = temp[2];
                                temp = numbers.clone();
                            }else{
                                temp = numbers.clone();
                            }
                        } catch (ArrayIndexOutOfBoundsException e) {
                            temp = numbers.clone();
                            e.printStackTrace();
                        }
                    }
                }catch (ArrayIndexOutOfBoundsException e){
                    e.printStackTrace();
                    temp=numbers.clone();
                }
            }
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        System.out.println("Answer: "+(100*noun+verb));
    }
}
