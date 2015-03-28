USE [DormManagement]
GO
/****** Object:  StoredProcedure [dbo].[Get_Dorm]    Script Date: 3/28/2015 5:57:40 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
-- =============================================
-- Author:		<Author,,Name>
-- Create date: <Create Date,,>
-- Description:	<Description,,>
-- =============================================
CREATE PROCEDURE [dbo].[Get_Dorm]
	
AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;

    -- Insert statements for procedure here
	SELECT DormName from Dorm
END

GO
/****** Object:  StoredProcedure [dbo].[Get_Room]    Script Date: 3/28/2015 5:57:40 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
-- =============================================
-- Author:		<Author,,Name>
-- Create date: <Create Date,,>
-- Description:	<Description,,>
-- =============================================
CREATE PROCEDURE [dbo].[Get_Room]
	@DormName nvarchar(50),
	@TypeName int
AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;

    -- Insert statements for procedure here
	SELECT RoomNo from Room where Dorm_ID=(select Dorm_ID from Dorm where DormName=@DormName) 
	and RoomType_ID=(select RoomType_ID from RoomType where TypeName=@TypeName)
	
END

GO
/****** Object:  StoredProcedure [dbo].[Get_RoomType]    Script Date: 3/28/2015 5:57:40 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
-- =============================================
-- Author:		<Author,,Name>
-- Create date: <Create Date,,>
-- Description:	<Description,,>
-- =============================================
CREATE PROCEDURE [dbo].[Get_RoomType] 
	
AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;

    -- Insert statements for procedure here
	SELECT TypeName from RoomType
END

GO
/****** Object:  StoredProcedure [dbo].[Get_StudentBetweenStartEndDate]    Script Date: 3/28/2015 5:57:40 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
-- =============================================
-- Author:		<Author,,Name>
-- Create date: <Create Date,,>
-- Description:	<Description,,>
-- =============================================
CREATE PROCEDURE [dbo].[Get_StudentBetweenStartEndDate]
	@StartDate date,
	@EndDate date,
	@DormName nvarchar(50),
	@RoomNo int
AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;

    select Count(st.StudentName) from Student st
inner join Hostel h on h.Student_ID=st.Student_ID

where  (((@StartDate>=h.StartDate and @EndDate>=h.EndDate and h.EndDate>=@StartDate )
or(h.StartDate<=@EndDate and h.StartDate>=@StartDate and h.EndDate>=@EndDate) 
or(h.StartDate<=@EndDate and h.StartDate<=@StartDate and h.EndDate>=@EndDate))
 and (h.Dorm_ID=(select Dorm_ID from Dorm where DormName=@DormName))
  and (h.Room_ID=(select Room_ID from Room where RoomNo=@RoomNo)))

END

GO
/****** Object:  StoredProcedure [dbo].[Get_StudentInfo]    Script Date: 3/28/2015 5:57:40 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
-- =============================================
-- Author:		<Author,,Name>
-- Create date: <Create Date,,>
-- Description:	<Description,,>
-- =============================================
CREATE PROCEDURE [dbo].[Get_StudentInfo] 
	-- Add the parameters for the stored procedure here
	@Name nvarchar(50),
	@Surname nvarchar(50)
AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;

    -- Insert statements for procedure here
	select StudentName, StudentSurname, TC_ID, Gender, st.Phone, Mail, Birthdate, Name, Surname, 
fmy.Phone, University, DepName, Grade, DormName, TypeName, RoomNo, StartDate, EndDate     
from Student st  
inner join Department dpt on dpt.Department_ID = st.Department_ID
inner join Family fmy on fmy.Family_ID = st.Family_ID
inner join Hostel hs on  st.Student_ID = hs.Student_ID  
inner join Dorm dm on dm.Dorm_ID = hs.Dorm_ID
inner join Room rm on rm.Room_ID = hs.Room_ID
inner join RoomType rt on rt.RoomType_ID = rm.RoomType_ID
where StudentName = @Name and StudentSurname = @Surname
END

GO
/****** Object:  StoredProcedure [dbo].[Get_StudentsinRoom]    Script Date: 3/28/2015 5:57:40 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
-- =============================================
-- Author:		<Author,,Name>
-- Create date: <Create Date,,>
-- Description:	<Description,,>
-- =============================================
CREATE PROCEDURE [dbo].[Get_StudentsinRoom]
	-- Add the parameters for the stored procedure here
	@Dormname nvarchar(50),
	@roomno int

AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;

    -- Insert statements for procedure here
	select st.StudentName,st.StudentSurname from Student st
inner join Hostel h on st.Student_ID=h.Student_ID
where Room_ID=(select Room_ID from Room where Dorm_ID=(select Dorm_ID from Dorm where DormName=@Dormname) and RoomNo=@roomno)
END



GO
/****** Object:  StoredProcedure [dbo].[Insert_Dorm]    Script Date: 3/28/2015 5:57:40 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
-- =============================================
-- Author:		<Author,,Name>
-- Create date: <Create Date,,>
-- Description:	<Description,,>
-- =============================================
CREATE PROCEDURE [dbo].[Insert_Dorm]
	@dormname nvarchar(50), 
	@location nvarchar(50)
AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;

    -- Insert statements for procedure her
	Insert into Dorm(DormName, Location) values (@dormname, @location)
END

GO
/****** Object:  StoredProcedure [dbo].[Insert_Room]    Script Date: 3/28/2015 5:57:40 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
-- =============================================
-- Author:		<Author,,Name>
-- Create date: <Create Date,,>
-- Description:	<Description,,>
-- =============================================
CREATE PROCEDURE [dbo].[Insert_Room]
	
	@roomno int,
	@roomtype nvarchar(50),
	@DormName nvarchar(50)
AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;

    -- Insert statements for procedure her
	insert into Room(RoomNo, RoomType_ID,Dorm_ID) values 
(@roomno,(select RoomType_ID from RoomType where TypeName=@roomtype)
,(select Dorm_ID from Dorm where DormName=@DormName))
END

GO
/****** Object:  StoredProcedure [dbo].[Insert_RoomType]    Script Date: 3/28/2015 5:57:40 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
-- =============================================
-- Author:		<Author,,Name>
-- Create date: <Create Date,,>
-- Description:	<Description,,>
-- =============================================
CREATE PROCEDURE [dbo].[Insert_RoomType]
	@typename nvarchar(50), 
	@roomprice decimal(5,2)
AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;

    -- Insert statements for procedure her
	Insert into RoomType(TypeName, Price) values (@typename, @roomprice)
END

GO
/****** Object:  StoredProcedure [dbo].[Insert_Student]    Script Date: 3/28/2015 5:57:40 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
-- =============================================
-- Author:		<Author,,Name>
-- Create date: <Create Date,,>
-- Description:	<Description,,>
-- =============================================
CREATE PROCEDURE [dbo].[Insert_Student]
	-- Add the parameters for the stored procedure here
@uni nvarchar (50),
@deptname nvarchar (50),
@grade int,
@Name nvarchar(50),
@Surname nvarchar(50),
@Phone nvarchar(50),
@SName nvarchar(50),
@SSurname nvarchar(50),
@Mail nvarchar(50),
@SPhone nvarchar(50),
@Gender nvarchar(50),
@Birthdate datetime,
@TC int,
@DormName nvarchar(50),
@RoomNo int,
@StartDate datetime,
@EndDate datetime

AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;

    -- Insert statements for procedure here
	insert into Department(University, DepName, Grade) Values (@uni, @deptname, @grade) 
	insert into Family(Name,Surname,Phone) Values (@Name,@Surname,@Phone)
		insert into Student(StudentName,StudentSurname,Mail,Phone,Gender,Birthdate,TC_ID,Family_ID,Department_ID) 
		values(@SName,@SSurname,@Mail,@Phone,@Gender,@Birthdate,@TC,@@IDENTITY,@@IDENTITY)
	insert into Hostel(Student_ID,Dorm_ID,Room_ID,StartDate,EndDate) 
	values((select Student_ID from Student where StudentName=@SName and StudentSurname=@SSurname),
			(select Dorm_ID from Dorm where DormName=@DormName),
			(select Room_ID from Room where RoomNo=@RoomNo),@StartDate,@EndDate)


end

GO
/****** Object:  StoredProcedure [dbo].[Update_StudentPersonalInfo]    Script Date: 3/28/2015 5:57:40 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
-- =============================================
-- Author:		<Author,,Name>
-- Create date: <Create Date,,>
-- Description:	<Description,,>
-- =============================================
CREATE PROCEDURE [dbo].[Update_StudentPersonalInfo]
@StudentNameV nvarchar(50),
@StudentSurnameV nvarchar(50),
@StudentName nvarchar(50),
@StudentSurname nvarchar(50),
@Mail nvarchar(100),
@Phone nvarchar(15),
@Gender nvarchar(10),
@Birthdate date,
@TC nvarchar(12),
@FName nvarchar(50),
@FSurname nvarchar (50),
@FPhone nvarchar(15),
@DepName nvarchar(50),
@University nvarchar(50),
@Grade int,
@StartDate date,
@EndDate date,
@DormName nvarchar(50),
@RoomType int,
@RoomNo int

AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;

   update Student set StudentName=@StudentNameV, StudentSurname=@StudentSurnameV
   , Mail=@Mail,Phone=@Phone,Gender=@Gender,Birthdate=@Birthdate,TC_ID=@TC
   where StudentName=@StudentName and StudentSurname=@StudentSurname

   update Family set Name=@FName,Surname=@FSurname,Phone=@FPhone
  where Family_ID=(select Family_ID from Student where StudentName=@StudentNameV and StudentSurname=@StudentSurnameV)

  update Department set DepName=@DepName, University=@University,Grade=@Grade
  where Department_ID=(select Department_ID from Student where StudentName=@StudentNameV and StudentSurname=@StudentSurnameV)
  
  update Hostel set StartDate=@StartDate,EndDate=@EndDate,Dorm_ID=(select Dorm_ID from Dorm where DormName=@DormName)
 ,Room_ID=(select Room_ID from Room r inner join RoomType rt on rt.RoomType_ID=r.RoomType_ID where r.RoomNo=@RoomNo )

 where Student_ID=(select Student_ID from Student where StudentName=@StudentNameV and StudentSurname=@StudentSurnameV)
END

GO
