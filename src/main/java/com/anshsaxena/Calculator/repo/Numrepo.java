package com.anshsaxena.Calculator.repo;

import com.anshsaxena.Calculator.model.Result;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.TreeSet;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Numrepo {
    ArrayList<Integer> number=new ArrayList<>();
    ArrayList<Integer> windowPrevState = new ArrayList<>();
    TreeSet<Integer> windowCurrState = new TreeSet<>();
    Double avg;
    Integer windowSize = 20 ;

    private  Result result;

    public Result checkAndAddDuplicate(ArrayList<Integer> arr) {



        number= new ArrayList<>(arr);
        double sum=0;
        int count=0;
        for(Integer num: arr){
            if(windowSize>arr.size()){
                windowCurrState.remove(0);
                windowCurrState.add(num);
                sum+=num;
                count++;
            }
            else {
                sum+=num;
                windowCurrState.add(num);
            }
        }
        avg= sum/count;
        windowPrevState= new ArrayList<>(windowCurrState);

        result.setAvg(avg);
        result.setNumber(number);
        result.setWindowCurrState(windowCurrState);
        result.setWindowPrevState(windowPrevState);
        return result;
    }
}
