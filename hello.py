print("Hello")
name = "Bhargov"
print(name)
# fullname = str(input("Enter your full name..."))
# print(fullname);

print(name.upper());
print(name.lower());

print(name.find("o"));

age = 16
if(age>=18):
    print("You can enter")
else:
    print("Get lost")

numbers = range(5)
print(numbers)

i=1;
while(i<=5):
    print(i)
    i=i+1

for i in range(5):
    print(i)
    i=i+1

def sum(a,b):
    print("Sum is",a+b)

sum(2,4)

# List: chagable, allow duplicate

items = ['Rice',4,"water",True]
print(items[0])
items.append('Go')
print(items)

# Tuple:unchagable, allow duplicate
items = ("a","b")
print(items[0])

# Set:unchangable, not allow duplicate value.
items = {"A","B"}
print(items)

# Dictionary: changable, no duplicate value
myDict = {
    "name":"BJD",
    "age" : 25
}
print(myDict["name"])


