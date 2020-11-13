dotnet new sln --name Ca0002
dotnet new classlib -lang "C#" -o src/main
dotnet sln add src\main\main.csproj
dotnet new xunit -lang "C#" -o src/test
dotnet sln add src\test\test.csproj
dotnet add src\test\test.csproj reference src\main\main.csproj

dotnet restore
dotnet build

dotnet test
