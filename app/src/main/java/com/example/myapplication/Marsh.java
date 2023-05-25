package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import Adapter.CourseAdapter;
import model.Course;

public class Marsh extends AppCompatActivity {
    RecyclerView courseRecycle;
    CourseAdapter courseAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marsh);


        List<Course> courseList = new ArrayList<>();
        courseList.add(new Course(1, "vilka_v_lyazhku","Сеть «Вилка-Ложка»",
                "Кафе Фермерские кафе «Вилка-Ложка» - это домашняя еда из деревенских продуктов. ... Каждое утро сотрудники кафе ВИЛКА ЛОЖКА выпекают свежий хлеб от компании Восход: “Мы используем опарную технологию приготовления теста и молочнокислые закваски, что позволяет в полной мере раскрыться аромату и вкусу хлеба, продлить его свежесть. Наш хлеб богат семенами и злаками, содержит природные витамины и микроэлементы, отлично подходит для сбалансированного питания и наполняет энергией",
                "https://www.google.ru/maps/search/Сеть+«Вилка-Ложка»/@56.8332557,60.5858951,15z/data=!3m1!4b1",
                "https://vilka-lozhka.com/" ));
        courseList.add(new Course(2, "backarryyy","Поль бейкери",
                "Кафе‑пекарня «Поль Бейкери» ‑ это самый свежий хлеб и выпечка, самые вкусные торты и пирожные. А также сэндвичи, пиццы, рапы, салаты и супы. Мы постоянно находимся в поиске новых рецептур, чтобы каждый нашёл для себя что‑нибудь по душе и захотел вернуться снова. Кафе‑пекарня «Поль Бейкери» ‑ это по‑домашнему уютный интерьер кафе, выполненный в стиле европейской пекарни.",
                "https://www.google.ru/maps/search/поль+бейкери/@56.8332549,60.5858951,15z/data=!3m1!4b1",
                "https://www.paulbakery.ru/"));
        courseList.add(new Course(3, "svol","Своя компания",
                "Сеть мягких ресторанов «Своя Компания» в Екатеринбурге: японская, итальянская, европейская и русская домашняя кухня, бизнес ланчи. Уютный семейный ресторан с детской комнатой в центре города! ... «Своя Компания» – сеть мягких ресторанов в Екатеринбурге. Встречи с семьей или друзьями, торжества, романтические свидания – это чудесные, волшебные и запоминающиеся моменты, которые хочется провести в приятной атмосфере",
                "https://www.google.ru/maps/search/Своя+компания/@56.833254,60.5858951,15z/data=!3m1!4b1",
                "https://svoya-kompaniya.ru/"));
        courseList.add(new Course(4, "suchkofff","Сушкоф и пицца",
                "Сушкоф и пицца комбинирует в меню предложения для всех и каждого. Сушкоф и пицца — это прекрасная подача меню и дизайн интерьера, который идеально подобран, чтобы дать посетителям обстановку спокойствия и уюта. Сушкоф и пицца — это разную пиццу на любой вкус, популярные блюда стран Европы, большой выбор блюд: от пиццы до лазаньи, суши, роллы, супы и лапша — основные блюда японской кухни, отличные закуски и вкусное свежее пиво, торты, пирожные, печенье разных видов, приятный бизнес-ланч по адекватной цене. Каждому посетителю заведение предлагает курьерскую доставку блюд домой и в офис.\n",
                "https://www.google.ru/maps/search/сушкоф+и+пицца/@56.8332468,60.5549954,13z/data=!3m1!4b1",
                "https://www.eda1.ru/"));
        courseList.add(new Course(5, "estoredd","Estory",
                "Первый фудмаркет в Екатеринбурге, который собрал больше тридцати ярких ресторанных концепций на одной площадке в самом центре города — в ТРЦ Гринвич. Что вкусненького. Фудмаркет ESTORY — это единое пространство, на котором представлены сильные рестораторы в моно-формате. Гастрономический тренд на объединение абсолютно разных кухонных концепций под одной крышей теперь и в Екатеринбурге! Качественная кухня в демократичной подаче.",
                "https://www.google.ru/maps/place/E-story/@56.8297916,60.5970562,17z/data=!3m1!4b1!4m6!3m5!1s0x43c16fa1edc206b7:0x24c281a7bd3cd79d!8m2!3d56.8297916!4d60.5996311!16s%2Fg%2F11ns3rl2m5",
                "https://estory.market/"));


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
}
