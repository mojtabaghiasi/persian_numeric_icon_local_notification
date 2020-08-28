package com.dexterous.flutterlocalnotifications;

import android.content.ContentValues.*;
import android.util.Log;
import com.dexterous.flutterlocalnotifications.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static android.content.ContentValues.TAG;

public class Constants {


    char[] PERSIAN_DIGITS = {'۰', '۱', '۲', '۳', '۴', '۵', '۶', '۷', '۸', '۹'};
    static  List<Integer> DAYS_ICONS_PERSIAN = Arrays.asList(
            0,
            R.drawable.day1, R.drawable.day2, R.drawable.day3, R.drawable.day4, R.drawable.day5,
            R.drawable.day6, R.drawable.day7, R.drawable.day8, R.drawable.day9, R.drawable.day10,
            R.drawable.day11, R.drawable.day12, R.drawable.day13, R.drawable.day14, R.drawable.day15,
            R.drawable.day16, R.drawable.day17, R.drawable.day18, R.drawable.day19, R.drawable.day20,
            R.drawable.day21, R.drawable.day22, R.drawable.day23, R.drawable.day24, R.drawable.day25,
            R.drawable.day26, R.drawable.day27, R.drawable.day28, R.drawable.day29, R.drawable.day30,
            R.drawable.day31
    );
    // No Urdu ones as they don't use them commonly nowadays
///
    char[] ARABIC_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    List<Integer> DAYS_ICONS_ARABIC = Arrays.asList(
            0,
            R.drawable.day1_ar, R.drawable.day2_ar, R.drawable.day3_ar, R.drawable.day4_ar,
            R.drawable.day5_ar, R.drawable.day6_ar, R.drawable.day7_ar, R.drawable.day8_ar,
            R.drawable.day9_ar, R.drawable.day10_ar, R.drawable.day11_ar, R.drawable.day12_ar,
            R.drawable.day13_ar, R.drawable.day14_ar, R.drawable.day15_ar, R.drawable.day16_ar,
            R.drawable.day17_ar, R.drawable.day18_ar, R.drawable.day19_ar, R.drawable.day20_ar,
            R.drawable.day21_ar, R.drawable.day22_ar, R.drawable.day23_ar, R.drawable.day24_ar,
            R.drawable.day25_ar, R.drawable.day26_ar, R.drawable.day27_ar, R.drawable.day28_ar,
            R.drawable.day29_ar, R.drawable.day30_ar, R.drawable.day31_ar
    );
    // Not that great to have charArrayOf('０', '１', '２', '３', '４', '５', '６', '７', '８', '９')
    char[] CJK_DIGITS = ARABIC_DIGITS;
    ///
    char[] ARABIC_INDIC_DIGITS = {'٠', '١', '٢', '٣', '٤', '٥', '٦', '٧', '٨', '٩'};
    List<Integer> DAYS_ICONS_ARABIC_INDIC = Arrays.asList(
            0,
            R.drawable.day1, R.drawable.day2, R.drawable.day3, R.drawable.day4_ckb, R.drawable.day5_ckb,
            R.drawable.day6_ckb, R.drawable.day7, R.drawable.day8, R.drawable.day9, R.drawable.day10,
            R.drawable.day11, R.drawable.day12, R.drawable.day13, R.drawable.day14_ckb,
            R.drawable.day15_ckb, R.drawable.day16_ckb, R.drawable.day17, R.drawable.day18,
            R.drawable.day19, R.drawable.day20, R.drawable.day21, R.drawable.day22, R.drawable.day23,
            R.drawable.day24_ckb, R.drawable.day25_ckb, R.drawable.day26_ckb, R.drawable.day27,
            R.drawable.day28, R.drawable.day29, R.drawable.day30, R.drawable.day31
    );

    static  int getDayIconResource(int day) {

        try {
            return DAYS_ICONS_PERSIAN.get(day);
        } catch (IndexOutOfBoundsException e) {
            Log.e(TAG, "No such field is available");
            return 1;
        }
    }
}


