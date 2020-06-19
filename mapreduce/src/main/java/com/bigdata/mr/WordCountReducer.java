package com.bigdata.mr;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;
import java.util.Iterator;

public class WordCountReducer extends Reducer<Text, IntWritable,Text, IntWritable> {
    int sum=0;
    IntWritable v=new IntWritable();
    @Override
    protected void reduce(Text key, Iterable<IntWritable> values, Context context) throws IOException, InterruptedException {
        Iterator<IntWritable> iterator = values.iterator();
        while (iterator.hasNext()) {
            sum =iterator.next().get()+sum;

        }
        v.set(sum);
        context.write(key,v);
    }

    @Override
    protected void cleanup(Context context) throws IOException, InterruptedException {


    }
}
