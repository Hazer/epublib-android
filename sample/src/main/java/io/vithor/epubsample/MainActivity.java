package io.vithor.epubsample;

import android.content.res.AssetManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import nl.siegmann.epublib.domain.Book;
import nl.siegmann.epublib.domain.Resource;
import nl.siegmann.epublib.epub.EpubReader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AssetManager assetManager = getAssets();
        try {
            InputStream epubInputStream = assetManager.open("Medcel.epub");
            Book book = (new EpubReader()).readEpub(epubInputStream);
            List<Resource> contents = book.getContents();
            Log.d("test", "" + contents.size());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
