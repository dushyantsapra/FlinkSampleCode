package com.flinkSampleCode.source;

import org.apache.flink.runtime.state.CheckpointListener;
import org.apache.flink.streaming.connectors.kafka.FlinkKafkaConsumer010;
import org.apache.flink.streaming.util.serialization.KeyedDeserializationSchema;

import java.util.List;
import java.util.Properties;
import java.util.regex.Pattern;

public class KafkaSource extends FlinkKafkaConsumer010 implements CheckpointListener {

    public KafkaSource(String topic, org.apache.flink.api.common.serialization.DeserializationSchema valueDeserializer, Properties props) {
        super(topic, valueDeserializer, props);
    }

    public KafkaSource(String topic, KeyedDeserializationSchema deserializer, Properties props) {
        super(topic, deserializer, props);
    }

    public KafkaSource(List topics, org.apache.flink.api.common.serialization.DeserializationSchema deserializer, Properties props) {
        super(topics, deserializer, props);
    }

    public KafkaSource(List topics, KeyedDeserializationSchema deserializer, Properties props) {
        super(topics, deserializer, props);
    }

    public KafkaSource(Pattern subscriptionPattern, org.apache.flink.api.common.serialization.DeserializationSchema valueDeserializer, Properties props) {
        super(subscriptionPattern, valueDeserializer, props);
    }

    public KafkaSource(Pattern subscriptionPattern, KeyedDeserializationSchema deserializer, Properties props) {
        super(subscriptionPattern, deserializer, props);
    }
}
