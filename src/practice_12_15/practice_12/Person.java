package practice_12_15.practice_12;


public class Person {
    public Person(String SNP) {
        System.out.print(splitName(SNP));
    }

    private StringBuilder splitName(String SNP){
        StringBuilder result = new StringBuilder();
        SNP = SNP.trim();
        int count = 0;
        for (String el: SNP.split(" ")) {
            if(count == 3){
                break;
            }
            if (count != 0){
                result.append(" ");
                result.append(el.charAt(0)).append(".");
            }
            else{
                result.append(el);
            }
            count++;
        }
        return result;
    }
}
