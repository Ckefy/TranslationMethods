cd ..
cd visual
cd graphviz
cd bin
set work_dir=C:\Users\Ckefy\Desktop\MT\Lab2.2\Parsed
for  %%f in (%work_dir%\*) do (
   dot -Tpng C:\Users\Ckefy\Desktop\MT\Lab2.2\Parsed\%%~nf.gv -oC:\Users\Ckefy\Desktop\MT\Lab2.2\Parsed\%%~nf.png
)
sleep 1000