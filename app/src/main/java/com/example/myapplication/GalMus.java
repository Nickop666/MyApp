package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;


import java.util.ArrayList;
import java.util.List;

import Adapter.CourseAdapter;
import model.Course;


public class GalMus extends AppCompatActivity {

    RecyclerView courseRecycle;
    CourseAdapter courseAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galmus);


        List<Course> courseList = new ArrayList<>();
        courseList.add(new Course(1, "elcincentr","Музей Бориса Ельцина",
                " Ельцин Центр -  крупная культурно-образовательная площадка. \n" +
                        "В Музее Бориса Ельцина с помощью новейших технологий показана жизнь первого президента России.  Экспозиция состоит из девяти залов. «Лабиринт» – зал, посвященный истории семьи Ельциных. Комплекс залов «Семь дней, которые изменили Россию» – рассказывает о первом президенте России и его эпохе.\n" +
                        "Кроме Музея в Ельцин Центре находятся арт-галерея, кино-конференц зал, архив, библиотека, книжный магазин, кафе, рестораны.",
                "https://www.google.ru/maps/place/Ельцин+Центр/@56.8448868,60.5909271,17z/data=!3m1!4b1!4m6!3m5!1s0x43c16e67465f8ea5:0x2d55b7e6b1aa059!8m2!3d56.8448868!4d60.5909271!16s%2Fg%2F11bx56f_x8",
                "https://yeltsin.ru/"));

        courseList.add(new Course(2, "visotski","Музей В.С. Высоцкого",
                "В небоскребе «Высоцкий» находится Екатеринбургский музей Владимира Высоцкого.\n" +
                "В музее вехами показана вся жизнь поэта и актера. В основу экспозиции вошли личные вещи Владимира Высоцкого, полностью восстановлен гостиничный номер, в котором он проживал, будучи на гастролях в Екатеринбурге. В музее представлены легендарный Mercedes 350 W 116, принадлежавший Владимиру Высоцкому, иконы, картины и украшения, которые принадлежали семье Высоцкого- Влади.\n" +
                "Самый ценный экспонат - последнее стихотворение В.Высоцкого. Этому документу присвоена категория «Культурная ценность Российской Федерации».",
                "https://www.google.ru/maps/place/Музей+В.+С.+Высоцкого/@56.8361176,60.6119289,17z/data=!3m1!4b1!4m6!3m5!1s0x43c16e8ee12e02db:0x12dc223e88ce7837!8m2!3d56.8361176!4d60.6145038!16s%2Fg%2F11f00pst84"
                ,"https://visotsky-e.ru/muzej-v-s-vysotskogo/o-muzee-v-s-vysotskogo.html"));

        courseList.add(new Course(3, "kozly","Дом Поклевских-Козелл",
                "Особняк «водочных королей Урала» – богатых дворян и предпринимателей Поклевских-Козелл – построен в 1870-х годах.\n" +
                        "Здесь Вы сможете узнать о семье алкогольных магнатов Поклевских-Козелл , увидеть подлинную продукцию и рекламу их заводов. .\n" +
                        "Также музей организует временные историко-краеведческие и художественные выставки, как из собственных фондов, так и с привлечением крупнейших музеев России и частных коллекционеров.",
                "https://www.google.ru/maps/place/Дом+Поклевских-Козелл/@56.8341026,60.6000522,17z/data=!3m1!4b1!4m6!3m5!1s0x43c16e8ca31bcb89:0x6c90a70f9cd9c7e8!8m2!3d56.8341026!4d60.6026271!16s%2Fg%2F11b77sprb3",
                "https://uole-museum.ru/museums/muzejno-vystavochnyj-tsentr-dom-poklevskih-kozell/"));

        courseList.add(new Course(4, "armitage","Эрмитаж урал",
                "На первом этаже расположен зал для временных выставок из Государственного Эрмитажа, на втором — постоянная экспозиция предметов западно-европейского искусства, большая часть которых была передана Эрмитажем в дар Свердловской картинной галерее (с 1988 года — Екатеринбургский музей изобразительных искусств). На третьем этаже - мемориальная экспозиция «В глубоком тылу», посвященная событиям периода эвакуации. ",
                "https://www.google.ru/maps/place/Центр+%22Эрмитаж-Урал%22/@56.8332562,60.5936199,17z/data=!3m1!4b1!4m6!3m5!1s0x43c16ef37d40919d:0x98c18880ab794976!8m2!3d56.8332562!4d60.5961948!16s%2Fg%2F1tdxn_q_",
                "https://i-z-o.art/visit/museum/centr-ermitazh-ural/"));


        courseList.add(new Course(5, "zdanie_muz","Музей истории и археологии Урала",
                "Экспозиция музея — это 5 этажей истории Урала с древних времен до эпохи Советского Союза. Среди них – Большой и Малый Шигирские идолы и другие ценные археологические находки, портреты Ермака Тимофеевича и генерала В. А. Глинки, охотничьи орудия, пряничные доски, русские (в том числе старообрядческие ) и башкирские костюмы и атрибуты , угольные печатки уральских заводов , камин и оконная решетка из дома инженера Ипатьева.",
                "https://www.google.ru/maps/place/Музей+истории+и+археологии+Урала/@56.8408471,60.6197831,17z/data=!3m1!4b1!4m6!3m5!1s0x43c16ffafa21a57d:0xd2391c90ecac5881!8m2!3d56.8408471!4d60.622358!16s%2Fg%2F11ghpz8c3k",
                "https://uole-museum.ru/museums/muzej-istorii-i-arheologii-urala/"));


        setCourseRecycler(courseList);



    }

    private void setCourseRecycler(List<Course> courseList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);

        courseRecycle = findViewById(R.id.categoryRecycler);
        courseRecycle.setLayoutManager(layoutManager);

        courseAdapter = new CourseAdapter(this, courseList);
        courseRecycle.setAdapter(courseAdapter);
    }





    public void back(View view){
        Intent back = new Intent(this, MainActivity.class);
        startActivity(back);
    }
    public void goToWebsite(View view) {
        String url = (String) view.getTag();
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }}
