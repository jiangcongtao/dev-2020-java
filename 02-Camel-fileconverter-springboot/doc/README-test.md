
mkdir -p temp/files
echo "Hello World" > temp/files/input
mv package

java -jar target/Camel-fileconverter-springboot-0.0.1-SNAPSHOT.jar

cat temp/output1/input
rm -rf temp
