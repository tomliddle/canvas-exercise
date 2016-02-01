
import org.scalatest.BeforeAndAfterEach
import org.scalatest.Matchers
import org.scalatest.WordSpec

class MainClassTest extends WordSpec with Matchers with BeforeAndAfterEach{


	"MainClass" when {

		"Drawing a line" should {

			"draw a line of length 1" in {
				val canvas = Canvas.create(4, 4)

				val array =
					Seq(
						Seq.fill[Char](6)('-'),
						Seq('|', 'X', ' ', ' ', ' ', '|'),
						Seq('|', ' ', ' ', ' ', ' ', '|'),
						Seq('|', ' ', ' ', ' ', ' ', '|'),
						Seq('|', ' ', ' ', ' ', ' ', '|'),
						Seq.fill[Char](6)('-'))

				canvas.drawLine(1, 1, 1, 1) should equal(Canvas(array))
			}

			"draw a horizontal line of length 4" in {
				val canvas = Canvas.create(4, 4)

				val array =
					Seq(
						Seq.fill[Char](6)('-'),
						Seq('|', ' ', ' ', ' ', ' ', '|'),
						Seq('|', 'X', 'X', 'X', 'X', '|'),
						Seq('|', ' ', ' ', ' ', ' ', '|'),
						Seq('|', ' ', ' ', ' ', ' ', '|'),
						Seq.fill[Char](6)('-'))

				canvas.drawLine(1, 2, 4, 2) should equal(Canvas(array))
			}

			"draw a vertical line of length 4" in {
				val canvas = Canvas.create(4, 4)

				val array =
					Seq(
						Seq.fill[Char](6)('-'),
						Seq('|', ' ', ' ', ' ', 'X', '|'),
						Seq('|', ' ', ' ', ' ', 'X', '|'),
						Seq('|', ' ', ' ', ' ', 'X', '|'),
						Seq('|', ' ', ' ', ' ', 'X', '|'),
						Seq.fill[Char](6)('-'))

				canvas.drawLine(4, 1, 4, 4) should equal(Canvas(array))
			}
		}

		"Drawing a rectangle" should {

			"draw a rectangle 4 x 4" in {
				val canvas = Canvas.create(4, 4)

				val array =
					Seq(
						Seq.fill[Char](6)('-'),
						Seq('|', 'X', 'X', 'X', 'X', '|'),
						Seq('|', 'X', ' ', ' ', 'X', '|'),
						Seq('|', 'X', ' ', ' ', 'X', '|'),
						Seq('|', 'X', 'X', 'X', 'X', '|'),
						Seq.fill[Char](6)('-'))

				canvas.drawRectangle(1, 1, 4, 4) should equal(Canvas(array))
			}

			"draw a rectangle 2 x 2" in {
				val canvas = Canvas.create(4, 4)

				val array =
					Seq(
						Seq.fill[Char](6)('-'),
						Seq('|', 'X', 'X', ' ', ' ', '|'),
						Seq('|', 'X', 'X', ' ', ' ', '|'),
						Seq('|', ' ', ' ', ' ', ' ', '|'),
						Seq('|', ' ', ' ', ' ', ' ', '|'),
						Seq.fill[Char](6)('-'))

				canvas.drawRectangle(1, 1, 2, 2) should equal(Canvas(array))
			}

			"draw a rectangle 1 x 1" in {
				val canvas = Canvas.create(4, 4)

				val array =
					Seq(
						Seq.fill[Char](6)('-'),
						Seq('|', ' ', ' ', ' ', ' ', '|'),
						Seq('|', ' ', 'X', ' ', ' ', '|'),
						Seq('|', ' ', ' ', ' ', ' ', '|'),
						Seq('|', ' ', ' ', ' ', ' ', '|'),
						Seq.fill[Char](6)('-'))

				canvas.drawRectangle(2, 2, 2, 2) should equal(Canvas(array))
			}

			"draw a rectangle 3 x 3" in {
				val canvas = Canvas.create(4, 4)

				val array =
					Seq(
						Seq.fill[Char](6)('-'),
						Seq('|', ' ', ' ', ' ', ' ', '|'),
						Seq('|', ' ', 'X', 'X', 'X', '|'),
						Seq('|', ' ', 'X', ' ', 'X', '|'),
						Seq('|', ' ', 'X', 'X', 'X', '|'),
						Seq.fill[Char](6)('-'))

				canvas.drawRectangle(2, 2, 4, 4) should equal(Canvas(array))
			}
		}
	}
}