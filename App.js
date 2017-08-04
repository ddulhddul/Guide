import React, {Component} from 'react';
import { StyleSheet, Text, View } from 'react-native';

export default class App extends React.Component {
  render() {
    return (
      <View style={styles.app}>
        <NavBar />
        <Body />
      </View>
    );
  }
}

class NavBar extends Component {
  render() {
    return (
      <View style={styles.navBar}>
        <Text>NavBar</Text>
      </View>
    );
  }
}

class Body extends Component {
  render() {
    return (
      <View style={styles.container}>
        <View style={styles.left}></View>
        <View style={styles.right}>
          <View style={styles.top}></View>
          <View style={styles.bottom}></View>
        </View>
      </View>
    );
  }
}




const styles = StyleSheet.create({
  app: {
    flex: 1,
    flexDirection: 'column'
  },
  container: {
    flex: 1,
    flexDirection: 'row'
  },
  left: {
    flex: 1,
    backgroundColor: 'red'
  },
  right: {
    flex: 1,
    flexDirection: 'column'
  },
  top: {
    flex: 1,
    backgroundColor: 'blue'
  },
  bottom: {
    flex: 2,
    backgroundColor: 'green'
  },
  navBar: {
    height: 50,
    alignItems: 'center',
    justifyContent: 'center'
  },
});
