package com.example.saad.dogproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ShowBreed extends AppCompatActivity {
    RecyclerView recyclerView;
    Recycler1Adapter recycler1Adapter;
    List<Recycler1Model> recycler1Models = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_breed);
        initViews();
        setAdapter();
    }
    private void initViews() {
        recyclerView = findViewById(R.id.saadi);
    }
    private void setAdapter() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(ShowBreed.this);
        recyclerView.setLayoutManager(layoutManager);
        if (recycler1Adapter == null) {
            prepareData();
            recycler1Adapter = new Recycler1Adapter(ShowBreed.this, recycler1Models);
        }
        recyclerView.setAdapter(recycler1Adapter);
    }
    private void prepareData() {
        recycler1Models.add(new Recycler1Model("Labrador retriever ", "Known for being easygoing, multi-talented and friendly, Labs have held the top spot for longer than any other breed since the AKC started counting in the 1880s. "));
        recycler1Models.add(new Recycler1Model("German shepherd", "The first impression of a German shepherd is that of a strong, agile, well muscled animal.It was first officially recognized by the AKC in 1908."));
        recycler1Models.add(new Recycler1Model("Golden retriever",  "Overall, AKC has leaned toward larger dogs in the past decade and the golden retriever is no exception."));
        recycler1Models.add(new Recycler1Model("French bulldog", "The French bulldog (Frenchie) is one of the most popular small-dog breeds. According to the AKC, the Frenchie is alert, adaptable and playful. "));
        recycler1Models.add(new Recycler1Model("Bulldog", "The bulldogs have been quietly moving up the list. It hit No. 4 in 2014 -- the highest ranking in the breed's history. It kept that spot in 2016 but slipped to No. 5 in 2017."));
        recycler1Models.add(new Recycler1Model("Beagle", "The beagle -- a happy, inquisitive short-haired hound -- ranked No. 6 on the list of most popular dog breeds for 2017 by the AKC."));
        recycler1Models.add(new Recycler1Model("Poodle", "The denominations standard, miniature, and toy are used to describe size only. All poodles are one breed."));
        recycler1Models.add(new Recycler1Model("Rottweilers", "At No. 8, the Rottweiler posted its highest ranking in almost 20 years. Renowned for their loyalty, confidence and protective instincts, Rotties were America's second-most-popular dog in 1997 but faded to 17th within a decade, as some small breeds surged for a time."));
        recycler1Models.add(new Recycler1Model("Yorkshire terrier", " Although the AKC has leaned towards larger dogs in the past decade, small breed Yorkies are still popular."));
        recycler1Models.add(new Recycler1Model("German shorthaired pointer", " The GSP stands between 23 and 25 inches tall at shoulder height and weighs up to 70 pounds, according to the AKC. Females tend to be smaller in both weight and height. "));
    }
}
