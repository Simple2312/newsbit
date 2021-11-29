package com.cmple.swipe;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;
import java.util.List;

public class MainActivity1 extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        final ViewPager2 videosViewPager = findViewById(R.id.videosViewPager);



        List<VideoItem> videoItems = new ArrayList<>();

        VideoItem videoItemCelebration = new VideoItem();
        videoItemCelebration.videoUrl = "https://simple2312.github.io/images/TWICE%20REALITY%20%E2%80%9CTIME%20TO%20TWICE%E2%80%9D%20Crime%20Scene%20Season%202%20TEASER.mp4";
        videoItemCelebration.videoTitle = "News";
        videoItemCelebration.videoDescription =  "Catch up with the news at instant.";
        videoItems.add(videoItemCelebration);

        VideoItem videoItemShorts = new VideoItem();
        videoItemShorts.videoUrl = "https://simple2312.github.io/images/5%20Google%20Secrets%20%F0%9F%98%8F.mp4";
        videoItemShorts.videoTitle = "Shorts";
        videoItemShorts.videoDescription =  "world snips right at one place";
        videoItems.add(videoItemShorts);

        VideoItem videoItemDance = new VideoItem();
        videoItemDance.videoUrl = "https://simple2312.github.io/images/TWICE%20_Formula%20of%20Love_%20O+T=%EF%BC%9C3_%20Opening%20Trailer.mp4";
        videoItemDance.videoTitle = "videos";
        videoItemDance.videoDescription =  "watch and enjoy";
        videoItems.add(videoItemDance);

        VideoItem videoItemScientist = new VideoItem();
        videoItemScientist.videoUrl = "https://simple2312.github.io/images/Android%20vs%20iPhone-%20who's%20got%20better%20INSULTS%20%F0%9F%98%A1.mp4";
        videoItemScientist.videoTitle = "The world";
        videoItemScientist.videoDescription =  "Get interesting videos to watch.";
        videoItems.add(videoItemScientist);

        VideoItem videoItemThefeels = new VideoItem();
        videoItemThefeels.videoUrl = "https://simple2312.github.io/images/Chaeyoung%E2%80%99s%20short%20film%20%F0%9F%8E%A5%20(Genius%20vs%20Bulldozer).mp4";
        videoItemThefeels.videoTitle = "Highlights";
        videoItemThefeels.videoDescription =  "Lets begin.";
        videoItems.add(videoItemThefeels);

        VideoItem videoItemDepend = new VideoItem();
        videoItemDepend.videoUrl = "https://simple2312.github.io/images/Twice-Girl-Group-Whatsapp-Status-Video.mp4";
        videoItemDepend.videoTitle = "Extras";
        videoItemDepend.videoDescription =  "Twice";
        videoItems.add(videoItemDepend);

        videosViewPager.setAdapter(new VideosAdapter(videoItems));



    }
}