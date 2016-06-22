package net.nashlegend.demo;

import net.nashlegend.anypref.annotations.PrefField;
import net.nashlegend.anypref.annotations.PrefIgnore;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by NashLegend on 16/6/2.
 */
public class SampleSub {

    @PrefField("intKey")
    public int subIntField = 65535;
    @PrefIgnore
    public float subFloatField = 1.235f;
    public long subLongField = 95789465213L;
    public String subStringField = "string";
    public boolean subBoolField = false;
    public Set<String> subSetValue = new LinkedHashSet<>();
    public String name = "father";

    public Sample sample;//如果SampleSub也有一个标记了PrefSub的Sample，就发生死循环
}
