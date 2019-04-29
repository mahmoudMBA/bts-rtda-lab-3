package session3

import org.scalatest.{FunSuite, Matchers}
import session3.models.{MostCommonBirdView, Sighting, TotalAmountView, UniquesBirdTypeDetectedView,CountrySightedCountView,TwoMostSightingCountriesView}
import session3.services.ViewCreatorService

class ViewCreatorServiceTest extends FunSuite with Matchers {

  test("Should create a TotalAmountView object from Sighting Seq"){
    val inputSightingSeq:Seq[Sighting]  = Seq(
      Sighting(12, "Italy"),
      Sighting(3, "Germany"),
      Sighting(1, "Italy"),
      Sighting(56, "England"),
      Sighting(1, "Cuba"),
      Sighting(567, "Germany"),
      Sighting(1, "EEUU"),
    )

    val expectedTotalAmountView = TotalAmountView(7)

    val realTotalAmountView: TotalAmountView = ViewCreatorService.createTotalAmountView(inputSightingSeq)

    realTotalAmountView should be (expectedTotalAmountView)
  }

  test("Should create a TotalBirdTypeDetectedView(7) object from Sighting Seq"){
    val inputSightingSeq:Seq[Sighting]  = Seq(
      Sighting(12, "Italy"),
      Sighting(3, "Germany"),
      Sighting(1, "Italy"),
      Sighting(56, "England"),
      Sighting(1, "Cuba"),
      Sighting(567, "Germany"),
      Sighting(1, "EEUU"),
    )

    val expectedUniquesBirdTypeDetectedView = UniquesBirdTypeDetectedView(5)

    val realUniquesBirdTypeDetectedView: UniquesBirdTypeDetectedView = ViewCreatorService.createUniquesBirdTypeDetectedView(inputSightingSeq)

    realUniquesBirdTypeDetectedView should be (expectedUniquesBirdTypeDetectedView)
  }

  test("Should create a UniquesBirdTypeDetectedView(5) object from Sighting Seq") {
    val inputSightingSeq:Seq[Sighting]  = Seq(
      Sighting(12, "Italy"),
      Sighting(3, "Germany"),
      Sighting(1, "Italy"),
      Sighting(56, "England"),
      Sighting(1, "Cuba"),
      Sighting(567, "Germany"),
      Sighting(1, "EEUU"),
    )

    val expectedUniquesBirdTypeDetectedView: UniquesBirdTypeDetectedView  = UniquesBirdTypeDetectedView(5)

    val realUniquesBirdTypeDetectedView: UniquesBirdTypeDetectedView = ViewCreatorService.createUniquesBirdTypeDetectedView(inputSightingSeq)

    realUniquesBirdTypeDetectedView should be (expectedUniquesBirdTypeDetectedView)
  }

  test("Should create a MostCommonBirdView(1, 3) object from Sighting Seq") {
    val inputSightingSeq:Seq[Sighting]  = Seq(
      Sighting(12, "Italy"),
      Sighting(3, "Germany"),
      Sighting(1, "Italy"),
      Sighting(56, "England"),
      Sighting(1, "Cuba"),
      Sighting(567, "Germany"),
      Sighting(1, "EEUU"),
    )

    val expectedMostCommonBirdView: MostCommonBirdView = MostCommonBirdView(1, 3)

    val realMostCommonBirdView: MostCommonBirdView = ViewCreatorService.createMostCommonBirdView(inputSightingSeq)

    realMostCommonBirdView should be (expectedMostCommonBirdView)

  }

  test("Should create a CountrySightedCountView(7) object from Sighting Seq"){
    val inputSightingSeq:Seq[Sighting]  = Seq(
      Sighting(12, "Italy"),
      Sighting(3, "Germany"),
      Sighting(1, "Italy"),
      Sighting(56, "England"),
      Sighting(1, "Cuba"),
      Sighting(567, "Germany"),
      Sighting(1, "EEUU"),
    )

    val expectedUniquesCoutryDetectedView = CountrySightedCountView(5)

    val realUniquesCountryDetectedView: CountrySightedCountView = ViewCreatorService.createCountrySightedCountView(inputSightingSeq)

    realUniquesCountryDetectedView should be (expectedUniquesCoutryDetectedView)
  }

  test("Should create a two most view countries(2) object from Sighting Seq"){
    val inputSightingSeq:Seq[Sighting]  = Seq(
      Sighting(12, "Italy"),
      Sighting(3, "Germany"),
      Sighting(1, "Italy"),
      Sighting(56, "England"),
      Sighting(1, "Cuba"),
      Sighting(567, "Germany"),
      Sighting(1, "EEUU"),
    )

    val expectedTwoCountriesDetectedView = TwoMostSightingCountriesView("Italy, Germany")

    val realUniquesCountryDetectedView: TwoMostSightingCountriesView = ViewCreatorService.createTwoMostSightingCountriesView(inputSightingSeq)

    realUniquesCountryDetectedView should be (expectedTwoCountriesDetectedView)
  }
}
