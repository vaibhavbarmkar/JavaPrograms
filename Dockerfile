FROM java:7
COPY /src/com/traningday2/ .
RUN javac Sum.java

CMD ["java", "Sum"]
