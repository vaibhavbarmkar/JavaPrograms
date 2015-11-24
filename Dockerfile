FROM java:7
COPY /src/com/traningday2/Sum.java .
RUN javac com/traningday2/Sum.java
CMD ["java", "com/traningday2/Sum"]
