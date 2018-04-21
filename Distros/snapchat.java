



<Project name="Snapchat">

	<target name="complile">
		<mkdir dir= "classes"/>
		<javac srcdir= "src" destdir="classes"/>

	</target>
<target name"package" depends="complile">
	<jar basedir="classes" destfile="lib/flipkart.jar"/>


</target>




