FROM java:7
COPY Sum.java .
RUN javac Sum.java

CMD ["java", "Sum"]
