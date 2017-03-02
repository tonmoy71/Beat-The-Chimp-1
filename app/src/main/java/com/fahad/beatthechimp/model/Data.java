package com.fahad.beatthechimp.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by fahad on 3/1/17.
 */

public class Data {

    private int size;
    private List<String> Grid = new ArrayList<String>(Collections.nCopies(49, "-10"));
    private List<Integer> Index = new ArrayList<>(49);



    private void initIndex(){
        for(int i = 0 ; i < Index.size() ; i++ ){
            Index.add(i);
        }
    }

    public List<String> getGrid() {
        return Grid;
    }

    public Data(int size){
        this.size = size;
        initGrid(size);
    }

    private void initGrid(int size){
        List<Integer> Value = RandomList(size);
        Index = RandomList(49);

        for(int i = 0 ; i < Value.size(); i++){
            Grid.set(Index.get(i), Value.get(i).toString() );
        }

    }


    public List<Integer> RandomList(int sz){
        List<Integer> list = new ArrayList<Integer>(sz);
        List<Integer> store = new ArrayList<Integer>(sz);
        for(int i = 1; i <= sz; i++) {
            list.add(i);
        }

        Random random = new Random();
        while(list.size() > 0) {
            int index = random.nextInt(list.size());
            store.add(list.remove(index));
        }
        return store;
    }
}
