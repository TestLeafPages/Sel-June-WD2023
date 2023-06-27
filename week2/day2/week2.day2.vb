


1.Parent to child

Basic xpath/tagname of child

//div[@class='nav-search-field ']/input


2.Grandparent to GrandChild

Basic xpath Gp//tagname Gc

(//div[@class='searchbox']//input)[2]


3.child to Parent

basic xpath child/parent::tagname parent 

//input[@id='twotabsearchtextbox']/parent::div

4.GrandChild to Grandparent

basic xpath Gc/ancestor::tagname Gp

//input[@name='q']/ancestor::div[@class='searchbox']

//input[contains(@class,'input__field-2')]/ancestor::div[@class='searchbox']


5.Elder sibling to younger sibling

basic xpath ES/following-sibling::tagname YS

//div[@id='pwcaps']/following-sibling::input

//label[text()='Search Amazon.in']/following-sibling::input

6.younger sibling to Elder sibling


basic xpath Ys/preceding-sibling::tagname ES

//input[@id='username']/preceding-sibling::div

//div[@id='pwcaps']/preceding-sibling::div


7.Elder cousin to younger cousin

base xpath for EC/following::tagname Yc

//span[@class='a-declarative']/following::a

8.Yc to EC
basic xpath Yc/preceding::tagname EC

//input[@name='rememberUn']/preceding::label[text()='Username']




classroom

https://www.snapdeal.com/

Men's Fashion-Es to Ys


https://www.myntra.com/?
search box- Ec to Yc