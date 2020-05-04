# INTRODUCTION TO SCIENTIFICAND

# ENGINEERING COMPUTATION

# Assignment 3

## April 2018

Ob jective: Findingtheb estparkingslotforthecar.

## Description

Jo eyloveshisnewFerrariandheisverycarefulwhiledrivingaroundthecity
andparkinginbigshoppingmall'sparkingareas. Wheneverheentersintoa
parkingarea,hesearchesforaslotthatisthefurthestawayfromtheexisting
cars.Hedrivesintheparkingarea,lo oksforalltheslotso ccupiedbyothercars
andndsthesafestslotforhisFerrari.YourjobistoguideJo eyastheb estas
youcan.

## Assignment

WriteaCprogramthatwillgetthesizeoftheparkingarea,thenumb erofcars
parked,andasequenceoflo cationso ccupiedbythecars. Theuserwillrst
inputthesizeoftheparkingareasuchas20whichrepresentsa 20 x 20 grid.
Second,theuserwillgivethenumb erofcarsparkedinthisarea,suchas15
indicatingthatthereare 15 carsparkedinthisarea.Finally,theuserwillinput
eachcar'slo cationinXandYaxis,suchas35indicatingthatacarisparked
atlo cationX=3andY=5.

Yourprogramwillkeepatwodimensionalarraythatrepresentsthegrid,and
thearraywillb elledwith 1 ifthegrid'sxthandythp ositionhasacarparked,
and 0 otherwise. Thenitshouldcalculateeachemptyslot'sdistancetothe
surroundingcars,andreturntheemptyslotwhichhasthelargestdistanceto
allcars.

Youarerequiredtocalculatethedistanceb etweentwolo cationsusingManhat-
tandistance(searchhowitiscomputed). Iftherearetwolo cationsthatcan
p otentiallyb etheb estslots(basedontheseslots'distancestotheothercars),


```
Figure1:Aparkingareaof 5 x 5 inwhichxindicatesthecarsparked.
```
yourprogramshouldreturntheonewiththesmallerXvalue.Iftheyb othhave
thesameXvalue,thenyourprogramshouldreturntheonewiththesmallerY
value.

Figure 1 representsaparkingareaof 5 x 5 andthecarsparkedindierent
lo cations.

Belowisanexamplerunbasedonthisgure:

```
Size: 5
Cars: 5
Locations: 3 2
Locations: 5 2
Locations: 5 3
Locations: 4 3
Locations: 2 2
Best Slot Found In: 1 5
```
- Makesuretoprop erlydo cumentyourfunctions(purp ose,parameters,etc)
    asshownintheclassandtheslides.
- Youneederrorcheckingonuserinput,e.g. theusercannotenterthe
    numb erofcarsthatexceedthelimitsoftheparkingareagrid. In a
    parkingareaof 5 x5,amaximumof 25 carscanb eparked.
- Youalsoneederrorcheckingwhenthereisnoavailableslotintheparking
    area.Insuchacase,theoutputshouldb e 0 0.

## Rules

- Yoursourceco delehastohavethenameassignment3.c.
- Yourprogramwillb ecompiledusingthefollowingcommandonaLinux
    system. Ifitcannotb ecompiledandlinkedusingthiscommand,itwill
    notb egraded(failedsubmission).

```
gcc -std=c99 -Wall -Werror assignment3.c -o assignment
```

- Yourprogramwillb echeckedusinganautomaticchecker. Therefore,
    makesureyouprintthemessagesexactlyasgivenintheexampleruns.
- DoNOTuseanyconstructthathasn'tb eencoveredinthecourseb efore
    thisweek,p ointers.AlsousenoC++featuressuchascoutandcin.
- DoNOTuseanyexternalfunctionsexceptforprintfandscanf.
- Makesureyourco dingstyleisprop erandconsistent.Usetheclang-format
    to olifnecessary.Don'tuseanyvariablenamesinalanguageotherthan
    English.
- Thisisanindividualassignment. Collab orationinanyformisNOTal-
    lowed. Noworkingtogether,nosharingco deinanyform including
    showingco detoyourclassmatestogivethemideas.
- Alltheco deyousubmitmustb eyourown.Don'tcopy/pasteanypieceof
    co defromanyresourceincludinganythingyou'vefoundontheInternet.
- Theassignmentswillb echeckedforplagiarismusingb othautomated
    to olsandmanualinsp ection.Anyassignmentinvolvingplagiarismand/or
    infringementofintellectualprop ertywillb enotb egradedandissub ject
    tofurtherdisciplinaryactions.


