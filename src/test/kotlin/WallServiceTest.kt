import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun add_test() {
        val result = WallService.add(
            Post(
                id = 1,
                1,
                2,
                3,
                20220323,
                "text",
                1,
                2,
                false,
                "usual",
                2,
                canPin = true,
                canDelete = true,
                canEdit = true,
                isPinned = false,
                markedAsAds = false,
                isFavorite = false,
                4,
                Post.Comments(3, canPost = true, groupsCanPost = true, canClose = true, canOpen = true),
                Post.Copyright(4, "www", "Sonya", "usual"),
                Post.Likes(2, userLikes = true, canLike = true, canPublish = true),
                Post.Reposts(2, true),
                Post.Views(4),
                Post.Donut(isDonut = false, 1, canPublishFreeCopy = true, "all")
            )
        )
        assertNotEquals(0, result.id)
    }

    @Test
    fun update_true() {
        WallService.add(
            Post(
            id = 2,
            3,
            4,
            5,
            20220324,
            "text2",
            2,
            3,
            false,
            "usual",
            3,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = false,
            markedAsAds = false,
            isFavorite = false,
            4,
            Post.Comments(3, canPost = true, groupsCanPost = true, canClose = true, canOpen = true),
            Post.Copyright(4, "www", "Vasya", "usual"),
            Post.Likes(7, userLikes = true, canLike = true, canPublish = true),
            Post.Reposts(3, true),
            Post.Views(15),
            Post.Donut(isDonut = true, 1, canPublishFreeCopy = true, "all")
        )
        )
        WallService.add(
            Post(
            id = 2,
            3,
            4,
            5,
            20220324,
            "text2",
            2,
            3,
            false,
            "usual",
            3,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = false,
            markedAsAds = false,
            isFavorite = false,
            4,
            Post.Comments(3, canPost = true, groupsCanPost = true, canClose = true, canOpen = true),
            Post.Copyright(4, "www", "Vasya", "usual"),
            Post.Likes(7, userLikes = true, canLike = true, canPublish = true),
            Post.Reposts(3, true),
            Post.Views(15),
            Post.Donut(isDonut = true, 1, canPublishFreeCopy = true, "all")
        )
        )
        val result = WallService.update(
            Post(
                id = 1,
                1,
                2,
                3,
                20220323,
                "text",
                1,
                2,
                false,
                "usual",
                2,
                canPin = true,
                canDelete = true,
                canEdit = true,
                isPinned = false,
                markedAsAds = false,
                isFavorite = false,
                4,
                Post.Comments(3, canPost = true, groupsCanPost = true, canClose = true, canOpen = true),
                Post.Copyright(4, "www", "Sonya", "usual"),
                Post.Likes(2, userLikes = true, canLike = true, canPublish = true),
                Post.Reposts(2, true),
                Post.Views(4),
                Post.Donut(isDonut = false, 1, canPublishFreeCopy = true, "all")
        )
        )

        assertEquals(true, result)
    }

    @Test
    fun update_false() {
        WallService.clear()

        WallService.add(
            Post(
                id = 2,
                3,
                4,
                5,
                20220324,
                "text2",
                2,
                3,
                false,
                "usual",
                3,
                canPin = true,
                canDelete = true,
                canEdit = true,
                isPinned = false,
                markedAsAds = false,
                isFavorite = false,
                4,
                Post.Comments(3, canPost = true, groupsCanPost = true, canClose = true, canOpen = true),
                Post.Copyright(4, "www", "Vasya", "usual"),
                Post.Likes(7, userLikes = true, canLike = true, canPublish = true),
                Post.Reposts(3, true),
                Post.Views(15),
                Post.Donut(isDonut = true, 1, canPublishFreeCopy = true, "all")
            )
        )
        val result = WallService.update(
            Post(
                id = 2,
                3,
                4,
                5,
                20220324,
                "text2",
                2,
                3,
                false,
                "usual",
                3,
                canPin = true,
                canDelete = true,
                canEdit = true,
                isPinned = false,
                markedAsAds = false,
                isFavorite = false,
                4,
                Post.Comments(3, canPost = true, groupsCanPost = true, canClose = true, canOpen = true),
                Post.Copyright(4, "www", "Vasya", "usual"),
                Post.Likes(7, userLikes = true, canLike = true, canPublish = true),
                Post.Reposts(3, true),
                Post.Views(15),
                Post.Donut(isDonut = true, 1, canPublishFreeCopy = true, "all")
            )
        )
        assertEquals(false, result)
    }
}