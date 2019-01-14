package com.example.saad.dogproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ShowSteps extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerAdapter recyclerAdapter;
    List<RecyclerModel> recyclerModels = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_steps);
        initViews();
        setAdapter();
    }
    private void initViews() {
        recyclerView = findViewById(R.id.recycler_view);
    }
    private void setAdapter() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(ShowSteps.this);
        recyclerView.setLayoutManager(layoutManager);
        if (recyclerAdapter == null) {
            prepareData();
            recyclerAdapter = new RecyclerAdapter(ShowSteps.this, recyclerModels);
        }
        recyclerView.setAdapter(recyclerAdapter);
    }
    private void prepareData() {
        recyclerModels.add(new RecyclerModel("Choose your dog's name wisely and be respectful of it. ", "Of course you'll want to pick a name for your new puppy or dog that you love, but for the purposes of training it also helps to consider a short name ending with a strong consonant. "));
        recyclerModels.add(new RecyclerModel("Decide on the house rules", "Before he comes home, decide what he can and can't do. Is he allowed on the bed or the furniture? Are parts of the house off limits? Will he have his own chair at your dining table? If the rules are settled on early."));
        recyclerModels.add(new RecyclerModel("Set up his private den",  "a room of his own.From the earliest possible moment give your pup or dog his own, private sleeping place that's not used by anyone else in the family, or another pet."));
        recyclerModels.add(new RecyclerModel("Help him relax when he comes home", "When your puppy gets home, give him a warm hot water bottle and put a ticking clock near his sleeping area. This imitates the heat and heartbeat of his litter mates and will soothe him in his new environment."));
        recyclerModels.add(new RecyclerModel("Teach him to come when called", "Come Jasper! Good boy! Teaching him to come is the command to be mastered first and foremost. And since he'll be coming to you, your alpha status will be reinforced. Get on his level and tell him to come using his name"));
        recyclerModels.add(new RecyclerModel("Reward his good behavior", "Reward your puppy or dog's good behavior with positive reinforcement. Use treats, toys, love, or heaps of praise. Let him know when's he's getting it right. Likewise, never reward bad behaviour; it'll only confuse him."));
        recyclerModels.add(new RecyclerModel("Take care of the jump up", "Puppies love to jump up in greeting. Don't reprimand him, just ignore his behavior and wait 'til he settles down before giving positive reinforcement."));
        recyclerModels.add(new RecyclerModel("Teach him on dog time", "Puppies and dogs live in the moment. Two minutes after they've done something, it's forgotten about. When he's doing something bad."));
        recyclerModels.add(new RecyclerModel("Discourage him from biting or nipping", " Instead of scolding him, a great way to put off your mouthy canine is to pretend that you're in great pain when he's biting or nipping you. He'll be so surprised he's likely to stop immediately."));
        recyclerModels.add(new RecyclerModel("End training sessions on a positive note", " Excellent boy! Good job, Jasper! He's worked hard to please you throughout the training. Leave him with lots of praise, a treat, some petting, or five minutes of play"));
    }
}
