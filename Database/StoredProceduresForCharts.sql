USE [DormManagement]
GO
/****** Object:  StoredProcedure [dbo].[Get_DormCapacity]    Script Date: 4/7/2015 6:33:38 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
-- =============================================
-- Author:		<Author,,Name>
-- Create date: <Create Date,,>
-- Description:	<Description,,>
-- =============================================
CREATE PROCEDURE [dbo].[Get_DormCapacity]
	@DormName nvarchar(50)
AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;

select sum(TypeName) from Room r
inner join RoomType rt on rt.RoomType_ID= r.RoomType_ID
where Dorm_ID=(select Dorm_ID from Dorm where DormName=@DormName)
END

GO
/****** Object:  StoredProcedure [dbo].[Get_FemaleNumber]    Script Date: 4/7/2015 6:33:38 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
-- =============================================
-- Author:		<Author,,Name>
-- Create date: <Create Date,,>
-- Description:	<Description,,>
-- =============================================
CREATE PROCEDURE [dbo].[Get_FemaleNumber]
	@DormName nvarchar(50)
AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;

    select Count(s.StudentName) from Student s
	inner join Hostel h on h.Student_ID=s.Student_ID
	inner join Dorm d on d.Dorm_ID=h.Dorm_ID
	where h.Dorm_ID=(select Dorm_ID from Dorm where DormName=@DormName) and s.Gender='Female'

END

GO
/****** Object:  StoredProcedure [dbo].[Get_MaleNumber]    Script Date: 4/7/2015 6:33:38 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
-- =============================================
-- Author:		<Author,,Name>
-- Create date: <Create Date,,>
-- Description:	<Description,,>
-- =============================================
CREATE PROCEDURE [dbo].[Get_MaleNumber]
	@DormName nvarchar(50)
AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;

    select Count(s.StudentName) from Student s
	inner join Hostel h on h.Student_ID=s.Student_ID
	inner join Dorm d on d.Dorm_ID=h.Dorm_ID
	where h.Dorm_ID=(select Dorm_ID from Dorm where DormName=@DormName) and s.Gender='Male'

END

GO
